package p5;

import P3.y;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import n5.M;
import r4.AbstractC1880i;
import r4.C1876e;
import u4.InterfaceC2102h;

/* loaded from: classes.dex */
public final class j implements M {
    public final k a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f14423b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14424c;

    public j(k kVar, String... strArr) {
        kotlin.jvm.internal.l.f("kind", kVar);
        kotlin.jvm.internal.l.f("formatParams", strArr);
        this.a = kVar;
        this.f14423b = strArr;
        b[] bVarArr = b.f14401k;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f14424c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(kVar.f14453k, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // n5.M
    public final AbstractC1880i d() {
        return (C1876e) C1876e.f14931f.getValue();
    }

    @Override // n5.M
    public final boolean e() {
        return false;
    }

    @Override // n5.M
    public final InterfaceC2102h f() {
        l.a.getClass();
        return l.f14456c;
    }

    @Override // n5.M
    public final Collection g() {
        return y.f7779k;
    }

    @Override // n5.M
    public final List getParameters() {
        return y.f7779k;
    }

    public final String toString() {
        return this.f14424c;
    }
}
