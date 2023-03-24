object Tags {
    private var tagDictionary: Map<String, String> = mapOf(
        "9F01" to "Acquirer Identifier",
        "9F40" to "Additional Terminal Capabilities",
        "81" to "Amount, Authorised (Binary)",
        "9F02" to "Amount, Authorised (Numeric)",
        "9F04" to "Amount, Other (Binary)",
        "9F03" to "Amount, Other (Numeric)",
        "9F3A" to "Amount, Reference Currency",
        "9F26" to "Application Cryptogram",
        "9F42" to "Application Currency Code",
        "9F44" to "Application Currency Exponent",
        "9F05" to "Application Discretionary Data",
        "5F25" to "Application Effective Date",
        "5F24" to "Application Expiration Date",
        "94" to "Application File Locator (AFL)",
        "4F" to "Application Identifier (AID) – card",
        "9F06" to "Application Identifier (AID) – terminal",
        "82" to "Application Interchange Profile",
        "50" to "Application Label",
        "9F12" to "Application Preferred Name",
        "5A" to "Application Primary Account Number (PAN)",
        "5F34" to "Application Primary Account Number (PAN) Sequence Number",
        "87" to "Application Priority Indicator",
        "9F3B" to "Application Reference Currency",
        "9F43" to "Application Reference Currency Exponent",
        "61" to "Application Template",
        "9F36" to "Application Transaction Counter (ATC)",
        "9F07" to "Application Usage Control",
        "9F08" to "Application Version Number",
        "9F09" to "Application Version Number",
        "89" to "Authorisation Code",
        "8A" to "Authorisation Response Code",
        "5F54" to "Bank Identifier Code (BIC)",
        "8C" to "Card Risk Management Data Object List 1 (CDOL1)",
        "8D" to "Card Risk Management Data Object List 2 (CDOL2)",
        "5F20" to "Cardholder Name",
        "9F0B" to "Cardholder Name Extended",
        "8E" to "Cardholder Verification Method (CVM) List",
        "9F34" to "Cardholder Verification Method (CVM) Results",
        "8F" to "Certification Authority Public Key Index",
        "9F22" to "Certification Authority Public Key Index",
        "83" to "Command Template",
        "9F27" to "Cryptogram Information Data",
        "9F45" to "Data Authentication Code",
        "84" to "Dedicated File (DF) Name",
        "9D" to "Directory Definition File (DDF) Name",
        "73" to "Directory Discretionary Template",
        "9F49" to "Dynamic Data Authentication Data Object List (DDOL)",
        "70" to "EMV Proprietary Template",
        "BF0C" to "File Control Information (FCI) Issuer Discretionary Data",
        "A5" to "File Control Information (FCI) Proprietary Template",
        "6F" to "File Control Information (FCI) Template",
        "9F4C" to "ICC Dynamic Number",
        "9F2D" to "Integrated Circuit Card (ICC) PIN Encipherment Public Key Certificate",
        "9F2E" to "Integrated Circuit Card (ICC) PIN Encipherment Public Key Exponent",
        "9F2F" to "Integrated Circuit Card (ICC) PIN Encipherment Public Key Remainder",
        "9F46" to "Integrated Circuit Card (ICC) Public Key Certificate",
        "9F47" to "Integrated Circuit Card (ICC) Public Key Exponent",
        "9F48" to "Integrated Circuit Card (ICC) Public Key Remainder",
        "9F1E" to "Interface Device (IFD) Serial Number",
        "5F53" to "International Bank Account Number (IBAN)",
        "9F0D" to "Issuer Action Code – Default",
        "9F0E" to "Issuer Action Code – Denial",
        "9F0F" to "Issuer Action Code – Online",
        "9F10" to "Issuer Application Data",
        "91" to "Issuer Authentication Data",
        "9F11" to "Issuer Code Table Index",
        "5F28" to "Issuer Country Code",
        "5F55" to "Issuer Country Code (alpha2 format)",
        "5F56" to "Issuer Country Code (alpha3 format)",
        "42" to "Issuer Identification Number (IIN)",
        "90" to "Issuer Public Key Certificate",
        "9F32" to "Issuer Public Key Exponent",
        "92" to "Issuer Public Key Remainder",
        "86" to "Issuer Script Command",
        "9F18" to "Issuer Script Identifier",
        "71" to "Issuer Script Template 1",
        "72" to "Issuer Script Template 2",
        "5F50" to "Issuer URL",
        "5F2D" to "Language Preference",
        "9F13" to "Last Online Application Transaction Counter (ATC) Register",
        "9F4D" to "Log Entry",
        "9F4F" to "Log Format",
        "9F14" to "Lower Consecutive Offline Limit",
        "9F15" to "Merchant Category Code",
        "9F16" to "Merchant Identifier",
        "9F4E" to "Merchant Name and Location",
        "9F17" to "Personal Identification Number (PIN) Try Counter",
        "9F39" to "Point-of-Service (POS) Entry Mode",
        "9F38" to "Processing Options Data Object List (PDOL)",
        "80" to "Response Message Template Format 1",
        "77" to "Response Message Template Format 2",
        "5F30" to "Service Code",
        "88" to "Short File Identifier (SFI)",
        "9F4B" to "Signed Dynamic Application Data",
        "93" to "Signed Static Application Data",
        "9F4A" to "	Static Data Authentication Tag List",
        "9F33" to "Terminal Capabilities",
        "9F1A" to "Terminal Country Code",
        "9F1B" to "Terminal Floor Limit",
        "9F1C" to "Terminal Identification",
        "9F1D" to "Terminal Risk Management Data",
        "9F35" to "Terminal Type",
        "95" to "Terminal Verification Results",
        "9F1F" to "Track 1 Discretionary Data",
        "9F20" to "Track 2 Discretionary Data",
        "57" to "Track 2 Equivalent Data",
        "98" to "Transaction Certificate (TC) Hash Value",
        "97" to "Transaction Certificate Data Object List (TDOL)",
        "5F2A" to "Transaction Currency Code",
        "5F36" to "Transaction Currency Exponent",
        "9A" to "Transaction Date",
        "99" to "Transaction Personal Identification Number (PIN) Data",
        "9F3C" to "Transaction Reference Currency Code",
        "9F3D" to "Transaction Reference Currency Exponent",
        "9F41" to "Transaction Sequence Counter",
        "9B" to "Transaction Status Information",
        "9F21" to "Transaction Time",
        "9C" to "Transaction Type",
        "9F37" to "Unpredictable Number",
        "9F23" to "Upper Consecutive Offline Limit",
        "9F7C" to "Customer Exclusive Data",
    )
    fun getTags(name: String): String {
        return tagDictionary[name] ?: "Unsupported Tag"
    }
}