package i4;

import java.io.Serializable;

/* renamed from: i4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1080f extends AbstractC1079e implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public int f12025l;

    /* renamed from: m, reason: collision with root package name */
    public int f12026m;

    /* renamed from: n, reason: collision with root package name */
    public int f12027n;

    /* renamed from: o, reason: collision with root package name */
    public int f12028o;

    /* renamed from: p, reason: collision with root package name */
    public int f12029p;

    /* renamed from: q, reason: collision with root package name */
    public int f12030q;

    @Override // i4.AbstractC1079e
    public final int a(int i7) {
        return ((-i7) >> 31) & (d() >>> (32 - i7));
    }

    @Override // i4.AbstractC1079e
    public final int d() {
        int i7 = this.f12025l;
        int i8 = i7 ^ (i7 >>> 2);
        this.f12025l = this.f12026m;
        this.f12026m = this.f12027n;
        this.f12027n = this.f12028o;
        int i9 = this.f12029p;
        this.f12028o = i9;
        int i10 = ((i8 ^ (i8 << 1)) ^ i9) ^ (i9 << 4);
        this.f12029p = i10;
        int i11 = this.f12030q + 362437;
        this.f12030q = i11;
        return i10 + i11;
    }
}
