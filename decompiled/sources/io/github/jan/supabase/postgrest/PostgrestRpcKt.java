package io.github.jan.supabase.postgrest;

import O3.C;
import S3.c;
import a6.C0673c;
import a6.d;
import e4.k;
import io.github.jan.supabase.postgrest.query.request.RpcRequestBuilder;
import io.github.jan.supabase.postgrest.result.PostgrestResult;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00022\u0019\b\n\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"rpc", "Lio/github/jan/supabase/postgrest/result/PostgrestResult;", "T", "", "Lio/github/jan/supabase/postgrest/Postgrest;", "function", "", "parameters", "request", "Lkotlin/Function1;", "Lio/github/jan/supabase/postgrest/query/request/RpcRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/postgrest/Postgrest;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postgrest-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PostgrestRpcKt {
    public static final <T> Object rpc(Postgrest postgrest, String str, T t7, k kVar, c<? super PostgrestResult> cVar) {
        postgrest.getSerializer();
        C0673c c0673c = d.f10459d;
        l.k();
        throw null;
    }

    public static Object rpc$default(Postgrest postgrest, String str, Object obj, k kVar, c cVar, int i7, Object obj2) {
        if ((i7 & 4) != 0) {
            AnonymousClass2 anonymousClass2 = new k() { // from class: io.github.jan.supabase.postgrest.PostgrestRpcKt.rpc.2
                public final void invoke(RpcRequestBuilder rpcRequestBuilder) {
                    l.f("<this>", rpcRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((RpcRequestBuilder) obj3);
                    return C.a;
                }
            };
        }
        postgrest.getSerializer();
        C0673c c0673c = d.f10459d;
        l.k();
        throw null;
    }
}
