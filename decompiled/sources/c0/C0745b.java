package c0;

import J5.d;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0745b extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC0746c f11115k;

    /* renamed from: l, reason: collision with root package name */
    public d f11116l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11117m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0746c f11118n;

    /* renamed from: o, reason: collision with root package name */
    public int f11119o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0745b(ViewOnAttachStateChangeListenerC0746c viewOnAttachStateChangeListenerC0746c, U3.c cVar) {
        super(cVar);
        this.f11118n = viewOnAttachStateChangeListenerC0746c;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f11117m = obj;
        this.f11119o |= Integer.MIN_VALUE;
        return this.f11118n.a(this);
    }
}
