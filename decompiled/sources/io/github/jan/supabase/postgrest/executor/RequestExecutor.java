package io.github.jan.supabase.postgrest.executor;

import S3.c;
import io.github.jan.supabase.postgrest.Postgrest;
import io.github.jan.supabase.postgrest.request.PostgrestRequest;
import io.github.jan.supabase.postgrest.result.PostgrestResult;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\n\u0082\u0001\u0001\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/postgrest/executor/RequestExecutor;", "", "execute", "Lio/github/jan/supabase/postgrest/result/PostgrestResult;", "postgrest", "Lio/github/jan/supabase/postgrest/Postgrest;", "path", "", "request", "Lio/github/jan/supabase/postgrest/request/PostgrestRequest;", "(Lio/github/jan/supabase/postgrest/Postgrest;Ljava/lang/String;Lio/github/jan/supabase/postgrest/request/PostgrestRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/github/jan/supabase/postgrest/executor/RestRequestExecutor;", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RequestExecutor {
    Object execute(Postgrest postgrest, String str, PostgrestRequest postgrestRequest, c<? super PostgrestResult> cVar);
}
