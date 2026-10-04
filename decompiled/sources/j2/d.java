package j2;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12236b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12237c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12238d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f12239e;

    /* renamed from: f, reason: collision with root package name */
    public final i[] f12240f;

    public d(String str, boolean z7, boolean z8, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f12236b = str;
        this.f12237c = z7;
        this.f12238d = z8;
        this.f12239e = strArr;
        this.f12240f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f12237c == dVar.f12237c && this.f12238d == dVar.f12238d && Objects.equals(this.f12236b, dVar.f12236b) && Arrays.equals(this.f12239e, dVar.f12239e) && Arrays.equals(this.f12240f, dVar.f12240f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (((527 + (this.f12237c ? 1 : 0)) * 31) + (this.f12238d ? 1 : 0)) * 31;
        String str = this.f12236b;
        return i7 + (str != null ? str.hashCode() : 0);
    }
}
