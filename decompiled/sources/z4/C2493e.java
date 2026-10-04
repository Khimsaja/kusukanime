package z4;

import A4.t;
import j5.InterfaceC1358m;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;

/* renamed from: z4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2493e implements InterfaceC1358m {

    /* renamed from: k, reason: collision with root package name */
    public static final C2493e f19032k = new C2493e();

    /* renamed from: l, reason: collision with root package name */
    public static final C2493e f19033l = new C2493e();

    @Override // j5.InterfaceC1358m
    public void a(InterfaceC2099e interfaceC2099e, ArrayList arrayList) {
        l.f("descriptor", interfaceC2099e);
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC2099e.getName() + ", unresolved classes " + arrayList);
    }

    public C2495g b(N4.c cVar) {
        l.f("javaElement", cVar);
        return new C2495g((t) cVar);
    }

    @Override // j5.InterfaceC1358m
    public void c(InterfaceC2097c interfaceC2097c) {
        l.f("descriptor", interfaceC2097c);
        throw new IllegalStateException("Cannot infer visibility for " + interfaceC2097c);
    }
}
