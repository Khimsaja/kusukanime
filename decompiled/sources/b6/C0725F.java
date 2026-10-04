package b6;

import O3.C0553b;
import java.util.LinkedHashMap;

/* renamed from: b6.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0725F extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C0553b f10973k;

    /* renamed from: l, reason: collision with root package name */
    public O4.c f10974l;

    /* renamed from: m, reason: collision with root package name */
    public LinkedHashMap f10975m;

    /* renamed from: n, reason: collision with root package name */
    public String f10976n;

    /* renamed from: o, reason: collision with root package name */
    public int f10977o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10978p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ O4.c f10979q;

    /* renamed from: r, reason: collision with root package name */
    public int f10980r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0725F(O4.c cVar, U3.a aVar) {
        super(aVar);
        this.f10979q = cVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f10978p = obj;
        this.f10980r |= Integer.MIN_VALUE;
        return O4.c.a(this.f10979q, null, this);
    }
}
