package io.ktor.util.debug;

import H5.A;
import H5.D;
import O3.C;
import P3.r;
import S3.c;
import S3.f;
import S3.g;
import T3.a;
import U3.e;
import U3.j;
import e4.k;
import e4.n;
import io.ktor.util.debug.plugins.PluginName;
import io.ktor.util.debug.plugins.PluginsTrace;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a<\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\b\u001a\u00020\u00072\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u0011\u001a\u00020\u000f\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u0001H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "Lkotlin/Function1;", "LS3/c;", "", "block", "initContextInDebugMode", "(Le4/k;LS3/c;)Ljava/lang/Object;", "", "pluginName", "addToContextInDebugMode", "(Ljava/lang/String;Le4/k;LS3/c;)Ljava/lang/Object;", "LS3/f;", "Element", "LS3/g;", "key", "LO3/C;", "action", "useContextElementInDebugMode", "(LS3/g;Le4/k;LS3/c;)Ljava/lang/Object;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextUtilsKt {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "LH5/A;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.util.debug.ContextUtilsKt$addToContextInDebugMode$2", f = "ContextUtils.kt", l = {37}, m = "invokeSuspend")
    /* renamed from: io.ktor.util.debug.ContextUtilsKt$addToContextInDebugMode$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ k $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(k kVar, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$block = kVar;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.$block, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super T> cVar) {
            return ((AnonymousClass2) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return obj;
            }
            r.Y(obj);
            k kVar = this.$block;
            this.label = 1;
            Object objInvoke = kVar.invoke(this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "LH5/A;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.util.debug.ContextUtilsKt$initContextInDebugMode$2", f = "ContextUtils.kt", l = {22}, m = "invokeSuspend")
    /* renamed from: io.ktor.util.debug.ContextUtilsKt$initContextInDebugMode$2, reason: invalid class name and case insensitive filesystem */
    public static final class C12462 extends j implements n {
        final /* synthetic */ k $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12462(k kVar, c<? super C12462> cVar) {
            super(2, cVar);
            this.$block = kVar;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return new C12462(this.$block, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super T> cVar) {
            return ((C12462) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return obj;
            }
            r.Y(obj);
            k kVar = this.$block;
            this.label = 1;
            Object objInvoke = kVar.invoke(this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    public static final <T> Object addToContextInDebugMode(String str, k kVar, c<? super T> cVar) {
        return !IntellijIdeaDebugDetector.INSTANCE.isDebuggerConnected() ? kVar.invoke(cVar) : D.G(cVar.getContext().plus(new PluginName(str)), new AnonymousClass2(kVar, null), cVar);
    }

    public static final <T> Object initContextInDebugMode(k kVar, c<? super T> cVar) {
        return !IntellijIdeaDebugDetector.INSTANCE.isDebuggerConnected() ? kVar.invoke(cVar) : D.G(cVar.getContext().plus(new PluginsTrace(null, 1, null)), new C12462(kVar, null), cVar);
    }

    public static final <Element extends f> Object useContextElementInDebugMode(g gVar, k kVar, c<? super C> cVar) {
        f fVar;
        boolean zIsDebuggerConnected = IntellijIdeaDebugDetector.INSTANCE.isDebuggerConnected();
        C c2 = C.a;
        if (zIsDebuggerConnected && (fVar = cVar.getContext().get(gVar)) != null) {
            kVar.invoke(fVar);
        }
        return c2;
    }
}
