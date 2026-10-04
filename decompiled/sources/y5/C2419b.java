package y5;

import P3.C;
import java.util.Iterator;

/* renamed from: y5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2419b implements h, c {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final h f18374b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18375c;

    public C2419b(h hVar, int i7, int i8) {
        this.a = i8;
        switch (i8) {
            case 1:
                this.f18374b = hVar;
                this.f18375c = i7;
                if (i7 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
            default:
                this.f18374b = hVar;
                this.f18375c = i7;
                if (i7 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
        }
    }

    @Override // y5.c
    public final h a(int i7) {
        switch (this.a) {
            case 0:
                int i8 = this.f18375c;
                int i9 = i8 + i7;
                return i9 < 0 ? new C2419b(this, i7, 1) : new n(this.f18374b, i8, i9);
            default:
                return i7 >= this.f18375c ? this : new C2419b(this.f18374b, i7, 1);
        }
    }

    @Override // y5.c
    public final h b(int i7) {
        switch (this.a) {
            case 0:
                int i8 = this.f18375c + i7;
                return i8 < 0 ? new C2419b(this, i7, 0) : new C2419b(this.f18374b, i8, 0);
            default:
                int i9 = this.f18375c;
                return i7 >= i9 ? d.a : new n(this.f18374b, i7, i9);
        }
    }

    @Override // y5.h
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new C(this);
            default:
                return new C(this, (byte) 0);
        }
    }
}
