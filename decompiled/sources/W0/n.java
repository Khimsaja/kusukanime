package W0;

import O.C0506n;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import e4.InterfaceC0821a;
import y0.e0;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f9574l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.k f9575m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0506n f9576n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X.j f9577o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f9578p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ View f9579q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, e4.k kVar, C0506n c0506n, X.j jVar, int i7, View view) {
        super(0);
        this.f9574l = context;
        this.f9575m = kVar;
        this.f9576n = c0506n;
        this.f9577o = jVar;
        this.f9578p = i7;
        this.f9579q = view;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f9579q;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.node.Owner", callback);
        e0 e0Var = (e0) callback;
        return new q(this.f9574l, this.f9575m, this.f9576n, this.f9577o, this.f9578p, e0Var).getLayoutNode();
    }
}
