package m5;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: m5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1516e extends C1521j {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f12978n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1516e(C1523l c1523l, ConcurrentHashMap concurrentHashMap, e4.k kVar, int i7) {
        super(c1523l, concurrentHashMap, kVar);
        this.f12978n = i7;
    }

    public static /* synthetic */ void a(int i7) {
        String str = i7 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 3 ? 3 : 2];
        if (i7 == 1) {
            objArr[0] = "map";
        } else if (i7 == 2) {
            objArr[0] = "computation";
        } else if (i7 != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i7 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i7 == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i7 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 == 3) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // m5.C1521j, e4.k
    public Object invoke(Object obj) throws Throwable {
        switch (this.f12978n) {
            case 1:
                Object objInvoke = super.invoke(obj);
                if (objInvoke != null) {
                    return objInvoke;
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
            default:
                return super.invoke(obj);
        }
    }
}
