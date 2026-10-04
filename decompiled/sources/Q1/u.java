package Q1;

import B1.AbstractC0015b;
import C1.w;
import H1.k0;
import java.util.Objects;
import y1.X;

/* loaded from: classes.dex */
public final class u {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final k0[] f7940b;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f7941c;

    /* renamed from: d, reason: collision with root package name */
    public final X f7942d;

    /* renamed from: e, reason: collision with root package name */
    public final w f7943e;

    public u(k0[] k0VarArr, s[] sVarArr, X x7, w wVar) {
        AbstractC0015b.c(k0VarArr.length == sVarArr.length);
        this.f7940b = k0VarArr;
        this.f7941c = (s[]) sVarArr.clone();
        this.f7942d = x7;
        this.f7943e = wVar;
        this.a = k0VarArr.length;
    }

    public final boolean a(u uVar, int i7) {
        return uVar != null && Objects.equals(this.f7940b[i7], uVar.f7940b[i7]) && Objects.equals(this.f7941c[i7], uVar.f7941c[i7]);
    }

    public final boolean b(int i7) {
        return this.f7940b[i7] != null;
    }
}
