package j2;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12230b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12231c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12232d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12233e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12234f;

    /* renamed from: g, reason: collision with root package name */
    public final i[] f12235g;

    public c(String str, int i7, int i8, long j7, long j8, i[] iVarArr) {
        super("CHAP");
        this.f12230b = str;
        this.f12231c = i7;
        this.f12232d = i8;
        this.f12233e = j7;
        this.f12234f = j8;
        this.f12235g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f12231c == cVar.f12231c && this.f12232d == cVar.f12232d && this.f12233e == cVar.f12233e && this.f12234f == cVar.f12234f && Objects.equals(this.f12230b, cVar.f12230b) && Arrays.equals(this.f12235g, cVar.f12235g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (((((((527 + this.f12231c) * 31) + this.f12232d) * 31) + ((int) this.f12233e)) * 31) + ((int) this.f12234f)) * 31;
        String str = this.f12230b;
        return i7 + (str != null ? str.hashCode() : 0);
    }
}
