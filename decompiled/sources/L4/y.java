package L4;

import b1.AbstractC0703b;
import java.util.ArrayList;
import java.util.List;
import n5.AbstractC1586x;

/* loaded from: classes.dex */
public final class y {
    public final AbstractC1586x a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6141b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6142c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6143d;

    public y(AbstractC1586x abstractC1586x, List list, ArrayList arrayList, List list2) {
        this.a = abstractC1586x;
        this.f6141b = list;
        this.f6142c = arrayList;
        this.f6143d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a.equals(yVar.a) && this.f6141b.equals(yVar.f6141b) && this.f6142c.equals(yVar.f6142c) && this.f6143d.equals(yVar.f6143d);
    }

    public final int hashCode() {
        return this.f6143d.hashCode() + AbstractC0703b.d((this.f6142c.hashCode() + ((this.f6141b.hashCode() + (this.a.hashCode() * 961)) * 31)) * 31, 31, false);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.a + ", receiverType=null, valueParameters=" + this.f6141b + ", typeParameters=" + this.f6142c + ", hasStableParameterNames=false, errors=" + this.f6143d + ')';
    }
}
