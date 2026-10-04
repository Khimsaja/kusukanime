package m5;

import H4.u;
import P3.r;
import n5.C1568e;

/* renamed from: m5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1515d extends C1519h implements InterfaceC1524m {

    /* renamed from: n, reason: collision with root package name */
    public volatile L2.e f12976n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A4.j f12977o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1515d(C1523l c1523l, u uVar, A4.j jVar) {
        super(c1523l, uVar);
        this.f12977o = jVar;
        if (c1523l == null) {
            d(0);
            throw null;
        }
        this.f12976n = null;
    }

    public static /* synthetic */ void a(int i7) {
        String str = i7 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i7 != 2 ? 2 : 3];
        if (i7 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i7 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i7 == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i7 == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void d(int i7) {
        String str = i7 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 2 ? 3 : 2];
        if (i7 == 1) {
            objArr[0] = "computable";
        } else if (i7 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i7 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i7 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // m5.C1519h
    public final void b(Object obj) {
        this.f12976n = new L2.e(obj);
        try {
            if (obj != null) {
                this.f12977o.invoke(obj);
            } else {
                a(2);
                throw null;
            }
        } finally {
            this.f12976n = null;
        }
    }

    @Override // m5.C1519h
    public final E3.b c(boolean z7) {
        return new E3.b(false, 3, new C1568e(r.H(p5.l.f14457d)));
    }

    @Override // m5.C1519h, e4.InterfaceC0821a
    public final Object invoke() throws Throwable {
        Object objInvoke;
        L2.e eVar = this.f12976n;
        if (eVar == null || ((Thread) eVar.f6046m) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else {
            if (((Thread) eVar.f6046m) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            objInvoke = eVar.f6045l;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        d(2);
        throw null;
    }
}
