import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
@Preview
fun TLVDecoder() {
    val scrollState = rememberScrollState()
    val coroutineScope = rememberCoroutineScope()

    val cache = remember { Cache.getDataFromCache<CacheData.TLVCache>(Mode.DECODE_TLV.value) }
    var tlvData by remember { mutableStateOf("5A085372820460088065820239009F360200689F2701409F34034203009F1E0831333030303234389F101201106002102C0000000000000000000000FF9F3303E0F8C89F350122950504002480009B02E8009F2608F3F940001D5DFB3A9F3704C98A31439F01060000000000009F02060000000000019F03060000000000005F25032211015F24032511305F3401009F1A02014457135372820460088065D25112201654335500000F8104000000015F2A0201449A032303189F21032037019C01005F20114E475559454E2F5448414E482054554E478A023030") }
    var value by remember { mutableStateOf(AnnotatedString("")) }
    var warning by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        cache?.let {
            tlvData = it.tlv
            value = decodeTLV(tlvData)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState)
    ) {
        Text("TLV")
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = tlvData,
            onValueChange = { tlvData = it },
            singleLine = false
        )

        if (warning)
            Text(text = warningMessage("Please fill in valid value"))

        Spacer(modifier = Modifier.height(32.dp))

        GradientButton(
            onClick = {
                coroutineScope.launch {
                    if (tlvData.isBlank()) warning = true
                    else {
                        value = decodeTLV(tlvData.trim())
                        Cache.saveToCache(
                            Mode.DECODE_TLV.value,
                            CacheData.TLVCache(
                                tlv = tlvData.trim()
                            )
                        )
                        scrollState.animateScrollTo(scrollState.maxValue)
                    }
                }
            },
            text = "Decode"
        )

        Spacer(modifier = Modifier.height(32.dp))

        SelectionContainer {
            Text(
                modifier = Modifier,
                text = value,
                color = Color.Blue
            )
        }
    }
}
