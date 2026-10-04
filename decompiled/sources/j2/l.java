package j2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends i {

    /* renamed from: b, reason: collision with root package name */
    public final int f12255b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12256c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12257d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f12258e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f12259f;

    public l(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f12255b = i7;
        this.f12256c = i8;
        this.f12257d = i9;
        this.f12258e = iArr;
        this.f12259f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f12255b == lVar.f12255b && this.f12256c == lVar.f12256c && this.f12257d == lVar.f12257d && Arrays.equals(this.f12258e, lVar.f12258e) && Arrays.equals(this.f12259f, lVar.f12259f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12259f) + ((Arrays.hashCode(this.f12258e) + ((((((527 + this.f12255b) * 31) + this.f12256c) * 31) + this.f12257d) * 31)) * 31);
    }
}
