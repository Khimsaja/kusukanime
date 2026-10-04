package M1;

import y1.C2393o;

/* loaded from: classes.dex */
public final class q extends Exception {

    /* renamed from: k, reason: collision with root package name */
    public final String f6470k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6471l;

    /* renamed from: m, reason: collision with root package name */
    public final p f6472m;

    /* renamed from: n, reason: collision with root package name */
    public final String f6473n;

    public q(C2393o c2393o, w wVar, boolean z7, int i7) {
        this("Decoder init failed: [" + i7 + "], " + c2393o, wVar, c2393o.f18112n, z7, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : "") + Math.abs(i7));
    }

    public q(String str, Throwable th, String str2, boolean z7, p pVar, String str3) {
        super(str, th);
        this.f6470k = str2;
        this.f6471l = z7;
        this.f6472m = pVar;
        this.f6473n = str3;
    }
}
