package m5;

import e4.InterfaceC0821a;

/* renamed from: m5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1520i extends C1519h implements InterfaceC1524m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1520i(C1523l c1523l, InterfaceC0821a interfaceC0821a) {
        super(c1523l, interfaceC0821a);
        if (c1523l != null) {
        } else {
            a(0);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i7) {
        String str = i7 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 2 ? 3 : 2];
        if (i7 == 1) {
            objArr[0] = "computable";
        } else if (i7 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        }
        if (i7 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
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

    @Override // m5.C1519h, e4.InterfaceC0821a
    public final Object invoke() throws Throwable {
        Object objInvoke = super.invoke();
        if (objInvoke != null) {
            return objInvoke;
        }
        a(2);
        throw null;
    }
}
