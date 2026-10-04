package io.ktor.http.content;

import H5.A;
import H5.D;
import H5.M;
import O3.C;
import O3.i;
import P3.r;
import U3.j;
import e4.k;
import e4.n;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0005\u001a\u00020\u00022\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a.\u0010\n\u001a\u00020\u00022\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\u0082@¢\u0006\u0004\b\n\u0010\u0006\"\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/Function1;", "LS3/c;", "LO3/C;", "", "block", "withBlocking", "(Le4/k;LS3/c;)Ljava/lang/Object;", "", "safeToRunInPlace", "()Z", "withBlockingAndRedispatch", "Ljava/lang/reflect/Method;", "isParkingAllowedFunction$delegate", "LO3/i;", "isParkingAllowedFunction", "()Ljava/lang/reflect/Method;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlockingBridgeKt {
    private static final i isParkingAllowedFunction$delegate = z1.c.C(new a(0));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.http.content.BlockingBridgeKt$withBlockingAndRedispatch$2", f = "BlockingBridge.kt", l = {45}, m = "invokeSuspend")
    /* renamed from: io.ktor.http.content.BlockingBridgeKt$withBlockingAndRedispatch$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ k $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(k kVar, S3.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$block = kVar;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return new AnonymousClass2(this.$block, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass2) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                k kVar = this.$block;
                this.label = 1;
                if (kVar.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            return C.a;
        }
    }

    private static final Method isParkingAllowedFunction() {
        return (Method) isParkingAllowedFunction$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method isParkingAllowedFunction_delegate$lambda$0() {
        try {
            return Class.forName("io.ktor.utils.io.jvm.javaio.PollersKt").getMethod("isParkingAllowed", new Class[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final boolean safeToRunInPlace() {
        try {
            Method methodIsParkingAllowedFunction = isParkingAllowedFunction();
            if (methodIsParkingAllowedFunction != null) {
                return l.a(methodIsParkingAllowedFunction.invoke(null, new Object[0]), Boolean.TRUE);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final Object withBlocking(k kVar, S3.c<? super C> cVar) {
        boolean zSafeToRunInPlace = safeToRunInPlace();
        C c2 = C.a;
        if (zSafeToRunInPlace) {
            Object objInvoke = kVar.invoke(cVar);
            return objInvoke == T3.a.f9048k ? objInvoke : c2;
        }
        Object objWithBlockingAndRedispatch = withBlockingAndRedispatch(kVar, cVar);
        return objWithBlockingAndRedispatch == T3.a.f9048k ? objWithBlockingAndRedispatch : c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object withBlockingAndRedispatch(k kVar, S3.c<? super C> cVar) {
        O5.e eVar = M.a;
        Object objG = D.G(O5.d.f7623l, new AnonymousClass2(kVar, null), cVar);
        return objG == T3.a.f9048k ? objG : C.a;
    }
}
