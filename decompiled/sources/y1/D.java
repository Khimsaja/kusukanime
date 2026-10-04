package y1;

import D.P0;
import android.text.TextUtils;
import f1.AbstractC0871d;
import io.ktor.http.ContentType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class D {
    public static final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f17931b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        P0 p0F;
        int iC;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (p0F = f(str2)) != null && (iC = p0F.c()) != 0 && iC != 16) {
                }
                break;
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        String string = null;
        if (str != null) {
            String[] strArrO = B1.K.O(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrO) {
                if (str2.equals(d(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                string = sb.toString();
            }
        }
        return string != null;
    }

    public static int c(String str, String str2) {
        P0 p0F;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (p0F = f(str2)) == null) {
                    return 0;
                }
                return p0F.c();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        P0 p0F;
        String strE = null;
        if (str != null) {
            String strR0 = AbstractC0871d.r0(str.trim());
            if (strR0.startsWith("avc1") || strR0.startsWith("avc3")) {
                return "video/avc";
            }
            if (strR0.startsWith("hev1") || strR0.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strR0.startsWith("dvav") || strR0.startsWith("dva1") || strR0.startsWith("dvhe") || strR0.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strR0.startsWith("av01")) {
                return "video/av01";
            }
            if (strR0.startsWith("vp9") || strR0.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strR0.startsWith("vp8") || strR0.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strR0.startsWith("mp4a")) {
                if (strR0.startsWith("mp4a.") && (p0F = f(strR0)) != null) {
                    strE = e(p0F.a);
                }
                return strE == null ? "audio/mp4a-latm" : strE;
            }
            if (strR0.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strR0.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strR0.startsWith("ac-3") || strR0.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strR0.startsWith("ec-3") || strR0.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strR0.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strR0.startsWith("ac-4") || strR0.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strR0.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strR0.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strR0.startsWith("dtsh") || strR0.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strR0.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strR0.startsWith("opus")) {
                return "audio/opus";
            }
            if (strR0.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strR0.startsWith("flac")) {
                return "audio/flac";
            }
            if (strR0.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strR0.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strR0.contains("cea708")) {
                return "application/cea-708";
            }
            if (strR0.contains("eia608") || strR0.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public static String e(int i7) {
        if (i7 == 32) {
            return "video/mp4v-es";
        }
        if (i7 == 33) {
            return "video/avc";
        }
        if (i7 == 35) {
            return "video/hevc";
        }
        if (i7 == 64) {
            return "audio/mp4a-latm";
        }
        if (i7 == 163) {
            return "video/wvc1";
        }
        if (i7 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i7 == 221) {
            return "audio/vorbis";
        }
        if (i7 == 165) {
            return "audio/ac3";
        }
        if (i7 == 166) {
            return "audio/eac3";
        }
        switch (i7) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i7) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static P0 f(String str) {
        Matcher matcher = f17931b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new P0(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (l(str)) {
            return 2;
        }
        if (k(str)) {
            return 3;
        }
        if (j(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static boolean i(String str) {
        return ContentType.Audio.TYPE.equals(g(str));
    }

    public static boolean j(String str) {
        return ContentType.Image.TYPE.equals(g(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean k(String str) {
        return ContentType.Text.TYPE.equals(g(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean l(String str) {
        return ContentType.Video.TYPE.equals(g(str));
    }

    public static String m(String str) {
        String strR0;
        if (str == null) {
            return null;
        }
        strR0 = AbstractC0871d.r0(str);
        strR0.getClass();
        switch (strR0) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strR0;
        }
    }
}
