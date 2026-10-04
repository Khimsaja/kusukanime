package W0;

import O.C0506n;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import y0.e0;
import z0.AbstractC2432a;

/* loaded from: classes.dex */
public final class q extends i {

    /* renamed from: G, reason: collision with root package name */
    public final View f9581G;

    /* renamed from: H, reason: collision with root package name */
    public final r0.e f9582H;
    public X.i I;
    public e4.k J;

    /* renamed from: K, reason: collision with root package name */
    public e4.k f9583K;

    /* renamed from: L, reason: collision with root package name */
    public e4.k f9584L;

    public q(Context context, e4.k kVar, C0506n c0506n, X.j jVar, int i7, e0 e0Var) {
        View view = (View) kVar.invoke(context);
        r0.e eVar = new r0.e();
        super(context, c0506n, i7, eVar, view, e0Var);
        this.f9581G = view;
        this.f9582H = eVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i7);
        Object objC = jVar != null ? jVar.c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objC instanceof SparseArray ? (SparseArray) objC : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (jVar != null) {
            setSavableRegistryEntry(jVar.d(strValueOf, new h(this, 2)));
        }
        a aVar = a.f9517p;
        this.J = aVar;
        this.f9583K = aVar;
        this.f9584L = aVar;
    }

    public static final void f(q qVar) {
        qVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(X.i iVar) {
        X.i iVar2 = this.I;
        if (iVar2 != null) {
            ((B2.l) iVar2).T();
        }
        this.I = iVar;
    }

    public final r0.e getDispatcher() {
        return this.f9582H;
    }

    public final e4.k getReleaseBlock() {
        return this.f9584L;
    }

    public final e4.k getResetBlock() {
        return this.f9583K;
    }

    public /* bridge */ /* synthetic */ AbstractC2432a getSubCompositionView() {
        return null;
    }

    public final e4.k getUpdateBlock() {
        return this.J;
    }

    public final void setReleaseBlock(e4.k kVar) {
        this.f9584L = kVar;
        setRelease(new h(this, 3));
    }

    public final void setResetBlock(e4.k kVar) {
        this.f9583K = kVar;
        setReset(new h(this, 4));
    }

    public final void setUpdateBlock(e4.k kVar) {
        this.J = kVar;
        setUpdate(new h(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
