package o5;

import io.ktor.http.LinkHeader;
import n5.AbstractC1566c;
import n5.B;
import n5.L;
import n5.V;
import n5.b0;

/* renamed from: o5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1701a extends AbstractC1566c {
    public final /* synthetic */ InterfaceC1702b a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f13798b;

    public C1701a(InterfaceC1702b interfaceC1702b, V v5) {
        this.a = interfaceC1702b;
        this.f13798b = v5;
    }

    @Override // n5.AbstractC1566c
    public final q5.e E(L l7, q5.d dVar) {
        kotlin.jvm.internal.l.f("state", l7);
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, dVar);
        InterfaceC1702b interfaceC1702b = this.a;
        B bT = interfaceC1702b.T(this.f13798b.g(interfaceC1702b.O0(dVar), b0.f13390m));
        kotlin.jvm.internal.l.c(bT);
        return bT;
    }
}
