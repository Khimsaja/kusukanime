package o3;

import G2.E;
import e4.o;

/* renamed from: o3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1643j implements o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13618k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f13619l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E f13620m;

    public /* synthetic */ C1643j(E e7, String str) {
        this.f13620m = e7;
        this.f13619l = str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v5 O3.r, still in use, count: 2, list:
          (r9v5 O3.r) from 0x0064: MOVE (r44v1 O3.r) = (r9v5 O3.r) (LINE:101)
          (r9v5 O3.r) from 0x0056: MOVE (r44v3 O3.r) = (r9v5 O3.r) (LINE:87)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // e4.o
    public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C1643j.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ C1643j(String str, E e7) {
        this.f13619l = str;
        this.f13620m = e7;
    }
}
