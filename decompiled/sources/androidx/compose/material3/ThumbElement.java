package androidx.compose.material3;

import L.L2;
import a0.p;
import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import p.AbstractC1745d;
import u.k;
import y0.AbstractC2359f;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/ThumbElement;", "Ly0/S;", "LL/L2;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class ThumbElement extends S {
    public final k a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10638b;

    public ThumbElement(k kVar, boolean z7) {
        this.a = kVar;
        this.f10638b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return l.a(this.a, thumbElement.a) && this.f10638b == thumbElement.f10638b;
    }

    @Override // y0.S
    public final p h() {
        L2 l22 = new L2();
        l22.f5197x = this.a;
        l22.f5198y = this.f10638b;
        l22.f5195C = Float.NaN;
        l22.f5196D = Float.NaN;
        return l22;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10638b) + (this.a.hashCode() * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        L2 l22 = (L2) pVar;
        l22.f5197x = this.a;
        boolean z7 = l22.f5198y;
        boolean z8 = this.f10638b;
        if (z7 != z8) {
            AbstractC2359f.o(l22);
        }
        l22.f5198y = z8;
        if (l22.f5194B == null && !Float.isNaN(l22.f5196D)) {
            l22.f5194B = AbstractC1745d.a(l22.f5196D);
        }
        if (l22.f5193A != null || Float.isNaN(l22.f5195C)) {
            return;
        }
        l22.f5193A = AbstractC1745d.a(l22.f5195C);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThumbElement(interactionSource=");
        sb.append(this.a);
        sb.append(", checked=");
        return AbstractC0703b.n(sb, this.f10638b, ')');
    }
}
