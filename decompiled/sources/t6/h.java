package t6;

import b1.AbstractC0703b;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f16182b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16183c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f16184d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16185e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16186f;

    public h(boolean z7, Integer num, boolean z8, Integer num2, boolean z9, boolean z10) {
        this.a = z7;
        this.f16182b = num;
        this.f16183c = z8;
        this.f16184d = num2;
        this.f16185e = z9;
        this.f16186f = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && l.a(this.f16182b, hVar.f16182b) && this.f16183c == hVar.f16183c && l.a(this.f16184d, hVar.f16184d) && this.f16185e == hVar.f16185e && this.f16186f == hVar.f16186f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z7 = this.a;
        int i7 = z7;
        if (z7 != 0) {
            i7 = 1;
        }
        int i8 = i7 * 31;
        Integer num = this.f16182b;
        int iHashCode = (i8 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z8 = this.f16183c;
        int i9 = z8;
        if (z8 != 0) {
            i9 = 1;
        }
        int i10 = (iHashCode + i9) * 31;
        Integer num2 = this.f16184d;
        int iHashCode2 = (i10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z9 = this.f16185e;
        int i11 = z9;
        if (z9 != 0) {
            i11 = 1;
        }
        int i12 = (iHashCode2 + i11) * 31;
        boolean z10 = this.f16186f;
        return i12 + (z10 ? 1 : z10 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.f16182b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.f16183c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.f16184d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.f16185e);
        sb.append(", unknownValues=");
        return AbstractC0703b.n(sb, this.f16186f, ')');
    }
}
