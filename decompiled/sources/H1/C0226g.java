package H1;

import java.util.Locale;

/* renamed from: H1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226g {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f3472b;

    /* renamed from: c, reason: collision with root package name */
    public int f3473c;

    /* renamed from: d, reason: collision with root package name */
    public int f3474d;

    /* renamed from: e, reason: collision with root package name */
    public int f3475e;

    /* renamed from: f, reason: collision with root package name */
    public int f3476f;

    /* renamed from: g, reason: collision with root package name */
    public int f3477g;

    /* renamed from: h, reason: collision with root package name */
    public int f3478h;

    /* renamed from: i, reason: collision with root package name */
    public int f3479i;

    /* renamed from: j, reason: collision with root package name */
    public int f3480j;

    /* renamed from: k, reason: collision with root package name */
    public long f3481k;

    /* renamed from: l, reason: collision with root package name */
    public int f3482l;

    public final String toString() {
        int i7 = this.a;
        int i8 = this.f3472b;
        int i9 = this.f3473c;
        int i10 = this.f3474d;
        int i11 = this.f3475e;
        int i12 = this.f3476f;
        int i13 = this.f3477g;
        int i14 = this.f3478h;
        int i15 = this.f3479i;
        int i16 = this.f3480j;
        long j7 = this.f3481k;
        int i17 = this.f3482l;
        int i18 = B1.K.a;
        Locale locale = Locale.US;
        StringBuilder sbB = v.c0.b("DecoderCounters {\n decoderInits=", i7, ",\n decoderReleases=", i8, "\n queuedInputBuffers=");
        sbB.append(i9);
        sbB.append("\n skippedInputBuffers=");
        sbB.append(i10);
        sbB.append("\n renderedOutputBuffers=");
        sbB.append(i11);
        sbB.append("\n skippedOutputBuffers=");
        sbB.append(i12);
        sbB.append("\n droppedBuffers=");
        sbB.append(i13);
        sbB.append("\n droppedInputBuffers=");
        sbB.append(i14);
        sbB.append("\n maxConsecutiveDroppedBuffers=");
        sbB.append(i15);
        sbB.append("\n droppedToKeyframeEvents=");
        sbB.append(i16);
        sbB.append("\n totalVideoFrameProcessingOffsetUs=");
        sbB.append(j7);
        sbB.append("\n videoFrameProcessingOffsetCount=");
        sbB.append(i17);
        sbB.append("\n}");
        return sbB.toString();
    }
}
