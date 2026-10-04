package X1;

import B1.AbstractC0015b;

/* loaded from: classes.dex */
public final class d implements a {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9784b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9785c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9786d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9787e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9788f;

    public d(int i7, int i8, int i9, int i10, int i11, int i12) {
        this.a = i7;
        this.f9784b = i8;
        this.f9785c = i9;
        this.f9786d = i10;
        this.f9787e = i11;
        this.f9788f = i12;
    }

    public final int a() {
        int i7 = this.a;
        if (i7 == 1935960438) {
            return 2;
        }
        if (i7 == 1935963489) {
            return 1;
        }
        if (i7 == 1937012852) {
            return 3;
        }
        AbstractC0015b.v("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i7));
        return -1;
    }

    @Override // X1.a
    public final int getType() {
        return 1752331379;
    }
}
