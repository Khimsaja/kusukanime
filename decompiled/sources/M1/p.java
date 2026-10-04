package M1;

import B1.AbstractC0015b;
import B1.K;
import H1.C0227h;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import b1.AbstractC0703b;
import java.util.Objects;
import y1.C2384f;
import y1.C2393o;
import y1.D;

/* loaded from: classes.dex */
public final class p {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6462b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6463c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f6464d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6465e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6466f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6467g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6468h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6469i;

    public p(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.a = str;
        this.f6462b = str2;
        this.f6463c = str3;
        this.f6464d = codecCapabilities;
        this.f6467g = z7;
        this.f6465e = z10;
        this.f6466f = z11;
        this.f6468h = z12;
        this.f6469i = D.l(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d4) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(K.e(i7, widthAlignment) * widthAlignment, K.e(i8, heightAlignment) * heightAlignment);
        int i9 = point.x;
        int i10 = point.y;
        return (d4 == -1.0d || d4 < 1.0d) ? videoCapabilities.isSizeSupported(i9, i10) : videoCapabilities.areSizeAndRateSupported(i9, i10, Math.floor(d4));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static M1.p i(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17, boolean r18) {
        /*
            M1.p r0 = new M1.p
            r1 = 0
            r2 = 1
            if (r14 == 0) goto L39
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L39
            int r3 = B1.K.a
            r4 = 22
            if (r3 > r4) goto L37
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L26
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L37
        L26:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L39
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L37
            goto L39
        L37:
            r8 = r2
            goto L3a
        L39:
            r8 = r1
        L3a:
            if (r14 == 0) goto L42
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r14.isFeatureSupported(r3)
        L42:
            if (r18 != 0) goto L51
            if (r14 == 0) goto L4f
            java.lang.String r3 = "secure-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L4f
            goto L51
        L4f:
            r9 = r1
            goto L52
        L51:
            r9 = r2
        L52:
            int r3 = B1.K.a
            r4 = 35
            if (r3 < r4) goto L80
            if (r14 == 0) goto L80
            java.lang.String r3 = "detached-surface"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L80
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L80
            java.lang.String r4 = "OPPO"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L75
            goto L80
        L75:
            r10 = r2
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2 = r12
            goto L8a
        L80:
            r10 = r1
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r1 = r11
        L8a:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.p.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):M1.p");
    }

    public final C0227h b(C2393o c2393o, C2393o c2393o2) {
        C2393o c2393o3;
        C2393o c2393o4;
        int i7 = !Objects.equals(c2393o.f18112n, c2393o2.f18112n) ? 8 : 0;
        if (this.f6469i) {
            if (c2393o.f18122x != c2393o2.f18122x) {
                i7 |= 1024;
            }
            if (!this.f6465e && (c2393o.f18119u != c2393o2.f18119u || c2393o.f18120v != c2393o2.f18120v)) {
                i7 |= 512;
            }
            C2384f c2384f = c2393o.f18089B;
            boolean zE = C2384f.e(c2384f);
            C2384f c2384f2 = c2393o2.f18089B;
            if ((!zE || !C2384f.e(c2384f2)) && !Objects.equals(c2384f, c2384f2)) {
                i7 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !c2393o.b(c2393o2)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new C0227h(this.a, c2393o, c2393o2, c2393o.b(c2393o2) ? 3 : 2, 0);
            }
            c2393o3 = c2393o;
            c2393o4 = c2393o2;
        } else {
            c2393o3 = c2393o;
            c2393o4 = c2393o2;
            if (c2393o3.f18091D != c2393o4.f18091D) {
                i7 |= 4096;
            }
            if (c2393o3.f18092E != c2393o4.f18092E) {
                i7 |= 8192;
            }
            if (c2393o3.f18093F != c2393o4.f18093F) {
                i7 |= 16384;
            }
            String str = this.f6462b;
            if (i7 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = z.d(c2393o3);
                Pair pairD2 = z.d(c2393o4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C0227h(this.a, c2393o3, c2393o4, 3, 0);
                    }
                }
            }
            if (!c2393o3.b(c2393o4)) {
                i7 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new C0227h(this.a, c2393o3, c2393o4, 1, 0);
            }
        }
        return new C0227h(this.a, c2393o3, c2393o4, 0, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(y1.C2393o r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.p.c(y1.o, boolean):boolean");
    }

    public final boolean d(C2393o c2393o) {
        return (Objects.equals(c2393o.f18112n, "audio/flac") && c2393o.f18093F == 22 && K.a < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(C2393o c2393o) {
        int i7;
        String str = c2393o.f18112n;
        String str2 = this.f6462b;
        if (!(str2.equals(str) || str2.equals(z.b(c2393o))) || !c(c2393o, true) || !d(c2393o)) {
            return false;
        }
        if (this.f6469i) {
            int i8 = c2393o.f18119u;
            if (i8 > 0 && (i7 = c2393o.f18120v) > 0) {
                return g(i8, i7, c2393o.f18121w);
            }
        } else {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6464d;
            int i9 = c2393o.f18092E;
            if (i9 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i9)) {
                    h("sampleRate.support, " + i9);
                    return false;
                }
            }
            int i10 = c2393o.f18091D;
            if (i10 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((K.a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    AbstractC0015b.v("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i11 + "]");
                    maxInputChannelCount = i11;
                }
                if (maxInputChannelCount < i10) {
                    h("channelCount.support, " + i10);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(C2393o c2393o) {
        if (this.f6469i) {
            return this.f6465e;
        }
        Pair pairD = z.d(c2393o);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r12, int r13, double r14) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.p.g(int, int, double):boolean");
    }

    public final void h(String str) {
        StringBuilder sbQ = AbstractC0703b.q("NoSupport [", str, "] [");
        sbQ.append(this.a);
        sbQ.append(", ");
        sbQ.append(this.f6462b);
        sbQ.append("] [");
        sbQ.append(K.f301b);
        sbQ.append("]");
        AbstractC0015b.l("MediaCodecInfo", sbQ.toString());
    }

    public final String toString() {
        return this.a;
    }
}
