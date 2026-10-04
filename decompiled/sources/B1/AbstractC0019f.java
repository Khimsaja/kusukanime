package B1;

import android.graphics.Color;
import android.text.TextUtils;
import f1.AbstractC0871d;
import io.ktor.sse.ServerSentEventKt;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: B1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0019f {
    public static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f325b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f326c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f327d;

    static {
        HashMap map = new HashMap();
        f327d = map;
        A6.b.o(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        A6.b.o(-983041, map, "azure", -657956, "beige");
        A6.b.o(-6972, map, "bisque", -16777216, "black");
        A6.b.o(-5171, map, "blanchedalmond", -16776961, "blue");
        A6.b.o(-7722014, map, "blueviolet", -5952982, "brown");
        A6.b.o(-2180985, map, "burlywood", -10510688, "cadetblue");
        A6.b.o(-8388864, map, "chartreuse", -2987746, "chocolate");
        A6.b.o(-32944, map, "coral", -10185235, "cornflowerblue");
        A6.b.o(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        A6.b.o(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        A6.b.o(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        A6.b.o(-29696, map, "darkorange", -6737204, "darkorchid");
        A6.b.o(-7667712, map, "darkred", -1468806, "darksalmon");
        A6.b.o(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        A6.b.o(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        A6.b.o(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        A6.b.o(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        A6.b.o(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        A6.b.o(-38476, map, "hotpink", -3318692, "indianred");
        A6.b.o(-11861886, map, "indigo", -16, "ivory");
        A6.b.o(-989556, map, "khaki", -1644806, "lavender");
        A6.b.o(-3851, map, "lavenderblush", -8586240, "lawngreen");
        A6.b.o(-1331, map, "lemonchiffon", -5383962, "lightblue");
        A6.b.o(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        A6.b.o(-18751, map, "lightpink", -24454, "lightsalmon");
        A6.b.o(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        A6.b.o(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        A6.b.o(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        A6.b.o(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        A6.b.o(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        A6.b.o(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        A6.b.o(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        A6.b.o(-15132304, map, "midnightblue", -655366, "mintcream");
        A6.b.o(-6943, map, "mistyrose", -6987, "moccasin");
        A6.b.o(-8531, map, "navajowhite", -16777088, "navy");
        A6.b.o(-133658, map, "oldlace", -8355840, "olive");
        A6.b.o(-9728477, map, "olivedrab", -23296, "orange");
        A6.b.o(-47872, map, "orangered", -2461482, "orchid");
        A6.b.o(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        A6.b.o(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        A6.b.o(-4139, map, "papayawhip", -9543, "peachpuff");
        A6.b.o(-3308225, map, "peru", -16181, "pink");
        A6.b.o(-2252579, map, "plum", -5185306, "powderblue");
        A6.b.o(-8388480, map, "purple", -10079335, "rebeccapurple");
        A6.b.o(-65536, map, "red", -4419697, "rosybrown");
        A6.b.o(-12490271, map, "royalblue", -7650029, "saddlebrown");
        A6.b.o(-360334, map, "salmon", -744352, "sandybrown");
        A6.b.o(-13726889, map, "seagreen", -2578, "seashell");
        A6.b.o(-6270419, map, "sienna", -4144960, "silver");
        A6.b.o(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        A6.b.o(-12156236, map, "steelblue", -2968436, "tan");
        A6.b.o(-16744320, map, "teal", -2572328, "thistle");
        A6.b.o(-40121, map, "tomato", 0, "transparent");
        A6.b.o(-12525360, map, "turquoise", -1146130, "violet");
        A6.b.o(-663885, map, "wheat", -1, "white");
        A6.b.o(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z7) throws NumberFormatException {
        int i7;
        AbstractC0015b.c(!TextUtils.isEmpty(str));
        String strReplace = str.replace(ServerSentEventKt.SPACE, "");
        if (strReplace.charAt(0) == '#') {
            int i8 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i8;
            }
            if (strReplace.length() == 9) {
                return ((i8 & 255) << 24) | (i8 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z7 ? f326c : f325b).matcher(strReplace);
            if (matcher.matches()) {
                if (z7) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i7 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i7 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i9 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i10 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i7, i9, i10, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i11 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i12 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i11, i12, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f327d.get(AbstractC0871d.r0(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
