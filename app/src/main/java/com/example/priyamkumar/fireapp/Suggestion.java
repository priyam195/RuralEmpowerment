package com.example.priyamkumar.fireapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class Suggestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView suggestText= (TextView) findViewById(R.id.suggestTextView);
       // RequestQueue requestQueue;
        JSONArray students;
        JSONObject student;

        suggestText.setText("1. जैविक उत्पादों का उत्पादन\n" +
                "उत्पादन और फलों और सब्जियों कि मुक्त रसायन आकर्षक हो सकता से यदि सही तरीके से किया बेच रही हैं। इसका कारण यह है अधिक से अधिक लोगों के स्वास्थ्य बुद्धिमान सूचित होते जा रहे हैं। और वे अब खाद्य पदार्थ है कि कीटनाशकों और रासायनिक उर्वरकों से मुक्त नहीं हैं लेने के स्वास्थ्य के जोखिम के बारे में पता कर रहे हैं।\n" +
                "तो, अगर आप एक स्थानीय खेती व्यवसाय है जो सख्ती से जैविक विधियों सब्जियां, फल, सॉस, और स्थानीय व्यंजनों खेती करने के लिए गोद ले शुरू कर सकते हैं। अपने व्यापार, एक बड़ी हिट हो के रूप में लोगों दूर और पास से आने के लिए अपने \"सुरक्षित\" उत्पादों को खरीदने के लिए होगा।\n" +
                "व्यापार के इस प्रकार के लिए, आप का उत्पादन है कि आधिकारिक तौर पर जैविक या अभी भी कोई लेबल के साथ कार्बनिक चिह्नित कर रहे हैं बेचने के लिए विकल्प चुन सकते हैं। कुछ लोगों को कागजी कार्रवाई की बड़ी राशि शामिल होने के कारण अधिकारी लेबल छोड़। इसके अलावा, नियमों को भी सख्त या एक स्टार्ट-अप कंपनी के लिए कर लगाने हो सकता है।\n" +
                "\n" +
                "2. निर्माण\n" +
                "आप बढ़ईगीरी और लकड़ी का अच्छा ज्ञान है, तो इस का पीछा करने के लिए आदर्श उपक्रम है। ग्रामीण क्षेत्रों, किसानों और homeowners कौशल संरचनाओं के ऊपर डाल करने की जरूरत है (जैसे खत्तों, चिकन coops, आदि) नहीं हो सकता है कि वे आवासीय या व्यावसायिक प्रयोजनों के लिए की जरूरत है। इस प्रकार, एक छोटे निर्माण कंपनी शुरू करने के लिए सबसे अच्छा व्यापार विकल्प हो सकता है।\n" +
                "\n" +
                "\n" +
                "3. क्लीनिंग कंपनी\n" +
                "बड़े फार्मों या फार्मों उनके क्वार्टर में साफ़ कर हाथों के अतिरिक्त जोड़े आवश्यकता हो सकती है। इसलिए, एक छोटे से सफाई कंपनी अपने साप्ताहिक या मासिक सेवाओं की पेशकश करने में सक्षम हो सकता है। एक चतुर उद्यमी के रूप में, आप उस पर आधारित व्यापार के तथ्य यह है कि संरक्षण के लिए जारी रखा जरूरत है के प्रति सचेत हैं सेवाओं को पता होना चाहिए, तो यह है कि अगर वे काल की एक अनुबंधित राशि के लिए साइन अप 'पैक ठेके' जिसमें एक डिस्काउंट दिया जाता है की पेशकश करने के लिए सबसे अच्छा है (जैसे छह महीने)।\n" +
                "\n" +
                "4. परिवार सैलून\n" +
                "एक परिवार सैलून खोलने लोग हैं, जो आकर्षक, खूबसूरत और रचनात्मक कर रहे हैं के लिए एक अच्छा विकल्प है। जो लोग ग्रामीण क्षेत्रों में रहते पेशेवर सेवा के इस प्रकार के लिए उपयोग नहीं हो सकता है, इसलिए इस का फायदा उठाने के लिए एक संभावित जगह है।\n" +
                "\n" +
                "5. बेचना ताजा अंडे\n" +
                "घास खिलाया मुर्गियों से अंडे अब किराने का सामान और विशेषता दुकानों के बाद की मांग की जा करने के लिए शुरू कर रहे हैं। एक मुर्गी पालन का व्यवसाय शुरू करने या पालन देश के एक बहुत आवश्यकता नहीं है। हालांकि, राज्य के कानूनों यदि आवश्यकताओं को बिना किसी कठिनाई मुलाकात हो रहे हैं देखने के लिए जांच की जानी चाहिए।\n" +
                "\n" +
                "6. वेंडिंग भैंस के दूध\n" +
                "दूध का सबसे अच्छा उत्पादकों में से एक के चारों ओर एक भैंस है। सही देखभाल और उपचार के तहत, उच्च गुणवत्ता वाले दूध को सफलतापूर्वक प्राप्त किया जा सकता है। आप को ऊपर उठाने के प्रजनन, और भैंस दूध देने में कुशल हैं, तो आप अपने दम पर या कृषि श्रमिक के एक जोड़े के साथ इस व्यवसाय शुरू कर सकते हैं। जो लोग नहीं कर रहे हैं, आप के बजाय सब काम करने के लिए कुशल कृषि श्रमिक किराया करने के लिए विकल्प चुन सकते हैं।\n" +
                "\n" +
                "7. मिर्च काली मिर्च की खेती\n" +
                "अच्छी खेती कौशल के साथ उन लोगों के लिए, खेती के लिए विकल्पों शुरू हुआ कारोबार के लिए स्पष्ट विकल्प हैं। आप सभी की जरूरत बैग और बर्तन जहां मिर्च सामान्य रूप से उगाया जाता है समायोजित करने के लिए एक छोटे से ग्रीन हाउस है। सूरज की रोशनी और उपजाऊ मिट्टी का एक बहुत जोड़ने और आप किराने का सामान, दुकानें और पड़ोसियों के लिए गुणवत्ता मिर्च की बिक्री बहुत सारा पैसा बना सकते हैं।\n" +
                "\n" +
                "8. चाय बागवानी\n" +
                "चाय की बागवानी लोग हैं, जो चाय के बारे में भावुक कर रहे हैं के लिए एक सरल अभी तक आकर्षक विकल्प है। आप चाय झाड़ियों के रोपण के लिए भूमि का एक बड़ा पथ जरूरत नहीं है; वास्तव में, तुम भी उनके बालकनियों या बागान मालिकों में इसे विकसित करने के लिए विकल्प चुन सकते हैं। इस विकल्प के लिए, मिट्टी पूरी तरह से सूखा और सैंडी की जरूरत है।\n" +
                "\n" +
                "9. कॉफी बीन की खेती\n" +
                "आप कॉफी के बारे में भावुक हो, तो तुम आधे रास्ते वहाँ रहे हैं। केवल एक चीज आप की जरूरत है पता है कि कैसे एक कॉफी बीन खेती का व्यवसाय शुरू करने के लिए और तुम जाने के लिए अच्छे हैं। केवल आवश्यकताओं पॉलिथीन बैग, एक छायादार क्षेत्र, कॉफी के बीज, और एक व्यापार लाइसेंस हैं।\n" +
                "\n" +
                "10. बोनसाई ट्री खेती\n" +
                "वहाँ बाजार में आज बोन्साई वृक्षों की बिक्री के लिए एक से बढ़ आला है। इस उपक्रम पर तैयार करने से पहले, हालांकि, अगर आप धैर्य, बोन्साई रोपण कौशल, और एक हरी अंगूठे की आवश्यकता है।\n" +
                "\n" +
                "11. वनस्पति उद्यान खेत\n" +
                "आप एक बड़ा अवसर के रूप में कृषि पर विचार कर सकते हैं। आप सब्जियों आपको लगता है सबसे अच्छा से बढ़ेगा उत्पादन शुरू कर सकते हैं। यह हमेशा दो के साथ शुरू करने के लिए बेहतर है, और फिर आप के रूप में लाभ कमाने के अवसरों को दोगुना, अब आप अपने उत्पादन के स्तर को बढ़ा सकते हैं। आप उस विकल्प की व्यवहार्यता का समापन से पहले एक विशेषज्ञ से परामर्श करने के लिए आवश्यक हैं।\n" +
                "\n" +
                "12. कैम्पिंग की जगह\n" +
                "तुम्हें पता है कि अच्छी तरह से टेंट और अन्य जरूरी चीजें बनाता है कि यह पूरी तरह देखो के साथ सुसज्जित है एक शिविर स्थल शुरू कर सकते हैं। शहरी समाचार पत्रों में भी इस विज्ञापन दें और आप अपने शिविर स्थल के लिए मशगूल लोगों को देखना होगा। बच्चों और छात्रों को हमेशा दूर शिविर स्थलों के लिए बाहर देख रहे हैं और यह ठीक है कि वे क्या चाहते हो सकता है। और अगर आप अभी भी देश के बजाय दुकान है, तो आप अभी भी वहाँ सामग्री डेरा डाले बेचने के लिए शुरू कर सकते हैं; समूहों में से एक बहुत है कि ग्रामीण क्षेत्रों के पास डेरा डाले हुए यह मददगार मिल जाएगा के लिए आया था।\n" +
                "\n" +
                "13. लेखन स्टूडियो\n" +
                "आप एक रचनात्मक दिमाग है और आप रोचक और सुंदर कहानियाँ लिखने में अच्छा कर रहे हैं, तो आप ग्रामीण क्षेत्रों में जीवन के बारे में लिख सकते हैं, क्योंकि ग्रामीण क्षेत्रों शांत वातावरण है कि शांत वातावरण के शहरी क्षेत्रों में नहीं पाया जा सकता है, जो लोगों की है।\n" +
                "आप एक अच्छे लेखक होने के लिए एक पेशेवर लेखक बनने के लिए नहीं है। सब है कि आप के लिए जरूरी है नवाचार और प्रोत्साहित शिक्षित करने और अपनी कहानियों में लोगों को उत्तेजित करने की क्षमता है। इसके तत्काल बाद आप इसे भांप लेना, तुम बड़े पैमाने पर स्वतंत्र और यहां तक कि लोगों को आप के लिए काम करने की भर्ती शुरू करने के लिए शुरू कर सकते हैं।\n" +
                "\n" +
                "14. एक स्थानीय माल खुदरा बनें\n" +
                "आप ग्रामीण परिवेश में माल खुदरा बिक्री क्योंकि कई छोटे व्यवसायों के लिए पर्याप्त माल बेच थोक मूल्य निर्धारण के लिए है में अनुभव कठिनाई करना शुरू कर सकते हैं। स्थानीय sourced माल खुदरा बिक्री के रूप में पर्यटकों के लिए एक आकर्षक और उत्साहजनक खरीदारी के अनुभव को ग्रामीण क्षेत्रों में व्यावसायिक सेवा कर सकते हैं।\n" +
                "\n" +
                "15. टूर ऑपरेटर\n" +
                "आप स्थानीय जानकारी, परिवहन विकल्प, स्थानीय उत्सव और स्थानीय व्यापार के लिए सूत्रों के गाइड की पेशकश के द्वारा परेशान पर्यटकों को भुनाने सकते हैं।\n" +
                "\n" +
                "16. ब्रॉडबैंड इंटरनेट सेवा प्रदाता\n" +
                "इस व्यवसाय के विचार भी जोखिम भरा है और राजधानी गहन लग सकता है लेकिन यह संभव है और संभावित फायदेमंद है। आप अपने क्षेत्र में एक इंटरनेट सेवा प्रदाता स्थापित कर सकते हैं अगर वे धीमी गति से इंटरनेट कनेक्शन का सामना कर रहे हैं। यह इंटरनेट सेवा प्रदाता कभी कभी एक आईएसपी के रूप में जाना जाता है। आप प्रमुख डेटा वाहक से सेवाओं reselling द्वारा छोटे से शुरू कर सकते हैं।\n" +
                "\n" +
                "17. वैश्विक उत्पाद बेचते हैं\n" +
                "स्थानीय रूप से बने उत्पादों पर एक छोटे से समुदाय को ध्यान में ज्यादातर कारोबार। हालांकि, वहाँ हमेशा वैश्विक उत्पादों के लिए एक बाजार भी है। आप अपने छोटे समुदाय में बिक्री के लिए वैश्विक उत्पादों की पेशकश के द्वारा यथास्थिति को बाधित करने की हिम्मत कर सकते हैं, तो आप और अधिक लाभ की तुलना में आप कभी कल्पना कर देगा।\n" +
                "\n" +
                "18. बेच तय आइटम\n" +
                "समय के अधिकांश, लोगों को अपने उपकरणों और उपकरणों दूर फेंक जब वे टूटी हुई हो या मामूली दोष उठाओ। आप चीजों फिक्सिंग में बहुत अच्छा कर रहे हैं, तो आप इकट्ठा करने और इस तरह के आइटम फिक्सिंग, और फिर उन्हें जो उन्हें जरूरत है, लेकिन नए लोगों की लागत वहन नहीं कर सकते करने के लिए बेचकर एक भाग्य बना सकते हैं। इस कारोबार के दो आय दरवाजे खोलता है; टूटी हुई चीजों फिक्सिंग और चीजें आप तय कर दी है बेच रही है।\n" +
                "\n" +
                "19. स्थानीय कपड़े\n" +
                "छोटे समुदायों में रहने वाले लोग खुद को फैशन की अपनी पारंपरिक शैली के साथ भेद करने के लिए प्यार करता हूँ। इस कारण से, आप एक कठिन समय विदेशी कपड़े बेच हो सकता है। लेकिन अगर आप कपड़े की अपनी तरह बनाने के द्वारा लोगों की धुन पर नृत्य, आप लाभ के बहुत सारे कर देगा। आप निर्माता होने का नहीं है। आप समुदाय में एक या दो दर्जी खोजने के लिए और उन लोगों के साथ बातचीत कर सकते हैं। वे उपज है, और आप बेचते हैं।\n" +
                "\n" +
                "20. स्थानीय गहने\n" +
                "आप एक कलात्मक प्रतिभा है कि आकर्षक गहने में स्थानीय आइटम बारी करने के लिए सक्षम हो सकता है, तो क्यों व्यवसाय बनाने के लिए एक गहने शुरू कर दिया? यदि आपके पड़ोस मिट्टी के बर्तन, गोले, driftwood, मोती, या चट्टानों में समृद्ध है, आप इस तरह के झुमके, हार, कंगन, पेंडेंट के रूप में गहने के खूबसूरत टुकड़े में इन वस्तुओं को बदल सकते हैं, और इतने पर।\n" +
                "\n" +
                "21. शेयर अपने ज्ञान\n" +
                "आप कुछ अच्छा कर रहे हैं, तो आप अपने ज्ञान के चारों ओर एक व्यापार का निर्माण कर सकते हैं। आप एक खेल प्रशिक्षक, एक अंशकालिक शिक्षक, एक व्यवसाय के कोच, एक संगीत शिक्षक, और इतने पर हो सकता है। तुम सच में अपने सामान पता है और आप को सफलतापूर्वक दूसरों पर ज्ञान प्रदान कर सकते हैं, तो आप लाभ के बहुत सारे कर देगा।\n" +
                "\n" +
                "22. बेकरी\n" +
                "हर शहर में एक बेकरी प्यार करता है। आप एक शुरू कर सकते हैं और ताजा बेक्ड ब्रेड, केक, कुकी और पेस्ट्री की पेशकश करते हैं, और इतने पर। पाक का अच्छा ज्ञान होने एक अच्छा लाभ होगा। लेकिन अगर आप इसे अच्छा नहीं कर रहे हैं, तो आप हाथ है कि कला में भेंट कर रहे हैं रख सकता है। वहाँ हमेशा पके हुए खाद्य पदार्थों के लिए एक बाजार है। तो, तुम हार कभी नहीं होगा।\n" +
                "\n" +
                "23. फूलवाला\n" +
                "लोग विशेष अवसरों के लिए फूल खरीदने; जन्मदिन और अंत्येष्टि की तरह दु: खी लोगों के लिए और स्मारक सेवाओं में शादियों की तरह खुश लोगों से। तो, अगर आप एक व्यवसाय है कि सभी अवसरों, घटनाओं, और छुट्टियों के लिए फूल बेचता शुरू कर सकते हैं, आप पैसे की बहुत सारी कर देगा।\n" +
                "\n" +
                "24. कपड़े धोने की सेवा\n" +
                "हर कोई अपने या अपने कपड़े साफ प्यार करता है। तो, एक कपड़े धोने व्यापार छोटे शहरों में रहने वाले उद्यमियों के लिए एक बहुत अच्छा विचार होगा। यह एक मंदी सबूत व्यापार है, के बाद से लोगों को हर समय अपने कपड़े साफ करने की जरूरत है। और यह एक बहुत ही लाभदायक व्यवसाय के रूप में अच्छी तरह से है। आप सभी को शुरू करने के लिए जरूरत है एक कपड़े धोने की मशीन, दबाव लोहा, और सुखाने की मशीन है।\n" +
                "\n" +
                "25. जिम\n" +
                "कोई फर्क नहीं पड़ता कि कैसे ग्रामीण अपने समुदाय में हो सकता है, वहाँ हमेशा व्यक्तियों, जो व्यायाम और फिट रहने के लाभों को जानते होने जा रहा है। और ऐसे लोगों को आसानी से एक स्थानीय व्यायामशाला संरक्षण होगा। यहाँ चाल है कि आप एक जिम है कि सूट स्थानीय ब्याज की स्थापना करनी चाहिए। उदाहरण के लिए, यदि आपके शहर योग प्रेमियों शामिल हैं, तो अपने जिम में एक योग स्टूडियो शामिल हैं।\n" +
                "\n" +
                "26. एक लकड़ी वितरण कारोबार शुरू\n" +
                "तो, अब आप कई व्यवसायों आप शुरू करने और यहां तक कि जब आप एक छोटे से शहर में रहते हैं पर सफल हो सकते हैं देखते हैं कि देख सकते हैं। सबसे महत्वपूर्ण बात यह है कि आपको क्या करना चाहिए ध्यान से ब्याज की अपने क्षेत्र की पहचान है। तुम भी अपने व्यापार रोलिंग स्थापित करने के लिए कुछ विशेषज्ञ सलाह की जरूरत हो सकती है।\n");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
