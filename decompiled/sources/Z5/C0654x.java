package Z5;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Z5.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654x {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f10365e = new long[0];
    public final SerialDescriptor a;

    /* renamed from: b, reason: collision with root package name */
    public final b6.r f10366b;

    /* renamed from: c, reason: collision with root package name */
    public long f10367c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f10368d;

    public C0654x(SerialDescriptor serialDescriptor, b6.r rVar) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        this.a = serialDescriptor;
        this.f10366b = rVar;
        int iF = serialDescriptor.f();
        if (iF <= 64) {
            this.f10367c = iF != 64 ? (-1) << iF : 0L;
            this.f10368d = f10365e;
            return;
        }
        this.f10367c = 0L;
        int i7 = (iF - 1) >>> 6;
        long[] jArr = new long[i7];
        if ((iF & 63) != 0) {
            jArr[i7 - 1] = (-1) << iF;
        }
        this.f10368d = jArr;
    }
}
