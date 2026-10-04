package m5;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: m5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1521j implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final C1523l f12983k;

    /* renamed from: l, reason: collision with root package name */
    public final ConcurrentHashMap f12984l;

    /* renamed from: m, reason: collision with root package name */
    public final e4.k f12985m;

    public C1521j(C1523l c1523l, ConcurrentHashMap concurrentHashMap, e4.k kVar) {
        if (c1523l == null) {
            a(0);
            throw null;
        }
        this.f12983k = c1523l;
        this.f12984l = concurrentHashMap;
        this.f12985m = kVar;
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 3 || i7 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 3 || i7 == 4) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "map";
        } else if (i7 == 2) {
            objArr[0] = "compute";
        } else if (i7 == 3 || i7 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i7 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i7 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i7 != 3 && i7 != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 3 && i7 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final AssertionError b(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + EnumC1522k.f12987l + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f12983k);
        C1523l.e(assertionError);
        return assertionError;
    }

    public final AssertionError c(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f12983k);
        C1523l.e(assertionError);
        return assertionError;
    }

    public final AssertionError d(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + this.f12983k, th);
        C1523l.e(assertionError);
        return assertionError;
    }

    @Override // e4.k
    public Object invoke(Object obj) throws Throwable {
        AssertionError assertionErrorD;
        ConcurrentHashMap concurrentHashMap = this.f12984l;
        Object obj2 = concurrentHashMap.get(obj);
        EnumC1522k enumC1522k = EnumC1522k.f12987l;
        Object obj3 = w5.k.a;
        if (obj2 != null && obj2 != enumC1522k) {
            w5.k.j(obj2);
            if (obj2 == obj3) {
                return null;
            }
            return obj2;
        }
        C1523l c1523l = this.f12983k;
        InterfaceC1525n interfaceC1525n = c1523l.a;
        InterfaceC1525n interfaceC1525n2 = c1523l.a;
        interfaceC1525n.l();
        try {
            Object obj4 = concurrentHashMap.get(obj);
            EnumC1522k enumC1522k2 = EnumC1522k.f12988m;
            if (obj4 == enumC1522k) {
                E3.b bVarD = c1523l.d("", obj);
                if (bVarD == null) {
                    a(3);
                    throw null;
                }
                if (!bVarD.f1931b) {
                    Object obj5 = bVarD.f1932c;
                    interfaceC1525n2.k();
                    return obj5;
                }
                obj4 = enumC1522k2;
            }
            if (obj4 == enumC1522k2) {
                E3.b bVarD2 = c1523l.d("", obj);
                if (bVarD2 == null) {
                    a(3);
                    throw null;
                }
                if (!bVarD2.f1931b) {
                    Object obj6 = bVarD2.f1932c;
                    interfaceC1525n2.k();
                    return obj6;
                }
            }
            if (obj4 != null) {
                w5.k.j(obj4);
                assertionErrorC = obj4 != obj3 ? obj4 : null;
                interfaceC1525n2.k();
                return assertionErrorC;
            }
            try {
                concurrentHashMap.put(obj, enumC1522k);
                Object objInvoke = this.f12985m.invoke(obj);
                if (objInvoke != null) {
                    obj3 = objInvoke;
                }
                Object objPut = concurrentHashMap.put(obj, obj3);
                if (objPut == enumC1522k) {
                    interfaceC1525n2.k();
                    return objInvoke;
                }
                assertionErrorC = c(obj, objPut);
                throw assertionErrorC;
            } catch (Throwable th) {
                if (w5.k.h(th)) {
                    try {
                        Object objRemove = concurrentHashMap.remove(obj);
                        if (objRemove != enumC1522k) {
                            throw b(obj, objRemove);
                        }
                        throw th;
                    } finally {
                    }
                }
                C1512a c1512a = c1523l.f12992b;
                if (th == assertionErrorC) {
                    try {
                        concurrentHashMap.remove(obj);
                        c1512a.getClass();
                        throw th;
                    } finally {
                    }
                }
                Object objPut2 = concurrentHashMap.put(obj, new w5.j(th));
                if (objPut2 != enumC1522k) {
                    throw c(obj, objPut2);
                }
                c1512a.getClass();
                throw th;
                interfaceC1525n2.k();
                throw th;
            }
        } catch (Throwable th2) {
            interfaceC1525n2.k();
            throw th2;
        }
    }
}
