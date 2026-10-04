package M1;

import B1.AbstractC0015b;
import B1.K;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import f1.AbstractC0871d;
import j3.D;
import j3.G;
import j3.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import y1.C2393o;

/* loaded from: classes.dex */
public abstract class z {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (K.a < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((p) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(p.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new u(0, new k()));
        }
        if (K.a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((p) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((p) arrayList.remove(0));
    }

    public static String b(C2393o c2393o) {
        Pair pairD;
        if ("audio/eac3-joc".equals(c2393o.f18112n)) {
            return "audio/eac3";
        }
        String str = c2393o.f18112n;
        if ("video/dolby-vision".equals(str) && (pairD = d(c2393o)) != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(y1.C2393o r34) {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.z.d(y1.o):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z7, boolean z8) {
        try {
            v vVar = new v(str, z7, z8);
            HashMap map = a;
            List list = (List) map.get(vVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListF = f(vVar, new F5.o(z7, z8, str.equals("video/mv-hevc")));
            if (z7 && arrayListF.isEmpty() && K.a <= 23) {
                arrayListF = f(vVar, new A.e(20));
                if (!arrayListF.isEmpty()) {
                    AbstractC0015b.v("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((p) arrayListF.get(0)).a);
                }
            }
            a(str, arrayListF);
            G gS = G.s(arrayListF);
            map.put(vVar, gS);
            return gS;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(M1.v r21, M1.x r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.z.f(M1.v, M1.x):java.util.ArrayList");
    }

    public static X g(k kVar, C2393o c2393o, boolean z7, boolean z8) {
        String str = c2393o.f18112n;
        kVar.getClass();
        List listE = e(str, z7, z8);
        String strB = b(c2393o);
        List listE2 = strB == null ? X.f12304o : e(strB, z7, z8);
        D dR = G.r();
        dR.c(listE);
        dR.c(listE2);
        return dR.f();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z7, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z7 && str.endsWith(".secure")) {
            return false;
        }
        int i7 = K.a;
        if (i7 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i7 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (K.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (y1.D.i(str)) {
            return true;
        }
        String strR0 = AbstractC0871d.r0(mediaCodecInfo.getName());
        if (strR0.startsWith("arc.")) {
            return false;
        }
        if (strR0.startsWith("omx.google.") || strR0.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strR0.startsWith("omx.sec.") && strR0.contains(".sw.")) || strR0.equals("omx.qcom.video.decoder.hevcswvdec") || strR0.startsWith("c2.android.") || strR0.startsWith("c2.google.")) {
            return true;
        }
        return (strR0.startsWith("omx.") || strR0.startsWith("c2.")) ? false : true;
    }
}
