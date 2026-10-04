package C2;

import B1.AbstractC0015b;

/* loaded from: classes.dex */
public final class n {
    public final V1.G a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f790b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f791c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f792d;

    /* renamed from: e, reason: collision with root package name */
    public int f793e;

    /* renamed from: f, reason: collision with root package name */
    public int f794f;

    /* renamed from: g, reason: collision with root package name */
    public long f795g;

    /* renamed from: h, reason: collision with root package name */
    public long f796h;

    public n(V1.G g4) {
        this.a = g4;
    }

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.f791c) {
            int i9 = this.f794f;
            int i10 = (i7 + 1) - i9;
            if (i10 >= i8) {
                this.f794f = (i8 - i7) + i9;
            } else {
                this.f792d = ((bArr[i10] & 192) >> 6) == 0;
                this.f791c = false;
            }
        }
    }

    public final void b(int i7, long j7, boolean z7) {
        AbstractC0015b.h(this.f796h != -9223372036854775807L);
        if (this.f793e == 182 && z7 && this.f790b) {
            this.a.b(this.f796h, this.f792d ? 1 : 0, (int) (j7 - this.f795g), i7, null);
        }
        if (this.f793e != 179) {
            this.f795g = j7;
        }
    }
}
