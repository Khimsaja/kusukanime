package io.github.jan.supabase.network;

import O3.C;
import S3.c;
import e4.k;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH¦@¢\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH¦@¢\u0006\u0002\u0010\rJ1\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0019\b\u0006\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\rJ1\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0019\b\u0006\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\rJK\u0010\u0011\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u0002H\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0006\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\u0016JA\u0010\u0017\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u0002H\u00122\u0019\b\u0006\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\u0018J1\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0019\b\u0006\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\rJK\u0010\u0019\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u0002H\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0006\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\u0016JA\u0010\u001a\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u0002H\u00122\u0019\b\u0006\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\u0018J1\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0019\b\u0006\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\rJK\u0010\u001b\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u0002H\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0006\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\u0016JA\u0010\u001c\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u0002H\u00122\u0019\b\u0006\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\u0018J1\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0019\b\u0006\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\rJK\u0010\u001d\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u0002H\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0006\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\u0016JA\u0010\u001e\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u0002H\u00122\u0019\b\u0006\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086H¢\u0006\u0002\u0010\u0018¨\u0006\u001f"}, d2 = {"Lio/github/jan/supabase/network/SupabaseHttpClient;", "", "<init>", "()V", "request", "Lio/ktor/client/statement/HttpResponse;", "url", "", "builder", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareRequest", "Lio/ktor/client/statement/HttpStatement;", "get", "post", "T", "body", "contentType", "Lio/ktor/http/ContentType;", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/ContentType;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postJson", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "deleteJson", "patch", "patchJson", "put", "putJson", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SupabaseHttpClient {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    /* renamed from: io.github.jan.supabase.network.SupabaseHttpClient$delete$3, reason: invalid class name */
    public static final class AnonymousClass3 implements k {
        final /* synthetic */ k $builder;

        public AnonymousClass3(k kVar) {
            this.$builder = kVar;
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return C.a;
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            l.f("$this$request", httpRequestBuilder);
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
            this.$builder.invoke(httpRequestBuilder);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    /* renamed from: io.github.jan.supabase.network.SupabaseHttpClient$delete$6, reason: invalid class name */
    public static final class AnonymousClass6 implements k {
        final /* synthetic */ T $body;
        final /* synthetic */ k $builder;
        final /* synthetic */ ContentType $contentType;

        public AnonymousClass6(k kVar, ContentType contentType, T t7) {
            this.$builder = kVar;
            this.$contentType = contentType;
            this.$body = t7;
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return C.a;
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            l.f("$this$request", httpRequestBuilder);
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
            this.$builder.invoke(httpRequestBuilder);
            HttpMessagePropertiesKt.contentType(httpRequestBuilder, this.$contentType);
            Object obj = this.$body;
            if (obj == null) {
                httpRequestBuilder.setBody(NullBody.INSTANCE);
                l.k();
                throw null;
            }
            if (obj instanceof OutgoingContent) {
                httpRequestBuilder.setBody(obj);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(obj);
                l.k();
                throw null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    /* renamed from: io.github.jan.supabase.network.SupabaseHttpClient$get$3, reason: invalid class name and case insensitive filesystem */
    public static final class C11173 implements k {
        final /* synthetic */ k $builder;

        public C11173(k kVar) {
            this.$builder = kVar;
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return C.a;
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            l.f("$this$request", httpRequestBuilder);
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
            this.$builder.invoke(httpRequestBuilder);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    /* renamed from: io.github.jan.supabase.network.SupabaseHttpClient$patch$3, reason: invalid class name and case insensitive filesystem */
    public static final class C11193 implements k {
        final /* synthetic */ k $builder;

        public C11193(k kVar) {
            this.$builder = kVar;
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return C.a;
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            l.f("$this$request", httpRequestBuilder);
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
            this.$builder.invoke(httpRequestBuilder);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    /* renamed from: io.github.jan.supabase.network.SupabaseHttpClient$patch$6, reason: invalid class name and case insensitive filesystem */
    public static final class C11216 implements k {
        final /* synthetic */ T $body;
        final /* synthetic */ k $builder;
        final /* synthetic */ ContentType $contentType;

        public C11216(k kVar, ContentType contentType, T t7) {
            this.$builder = kVar;
            this.$contentType = contentType;
            this.$body = t7;
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return C.a;
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            l.f("$this$request", httpRequestBuilder);
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
            this.$builder.invoke(httpRequestBuilder);
            HttpMessagePropertiesKt.contentType(httpRequestBuilder, this.$contentType);
            Object obj = this.$body;
            if (obj == null) {
                httpRequestBuilder.setBody(NullBody.INSTANCE);
                l.k();
                throw null;
            }
            if (obj instanceof OutgoingContent) {
                httpRequestBuilder.setBody(obj);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(obj);
                l.k();
                throw null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    /* renamed from: io.github.jan.supabase.network.SupabaseHttpClient$post$3, reason: invalid class name and case insensitive filesystem */
    public static final class C11243 implements k {
        final /* synthetic */ k $builder;

        public C11243(k kVar) {
            this.$builder = kVar;
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return C.a;
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            l.f("$this$request", httpRequestBuilder);
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
            this.$builder.invoke(httpRequestBuilder);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    /* renamed from: io.github.jan.supabase.network.SupabaseHttpClient$post$6, reason: invalid class name and case insensitive filesystem */
    public static final class C11266 implements k {
        final /* synthetic */ T $body;
        final /* synthetic */ k $builder;
        final /* synthetic */ ContentType $contentType;

        public C11266(k kVar, ContentType contentType, T t7) {
            this.$builder = kVar;
            this.$contentType = contentType;
            this.$body = t7;
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return C.a;
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            l.f("$this$request", httpRequestBuilder);
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
            this.$builder.invoke(httpRequestBuilder);
            HttpMessagePropertiesKt.contentType(httpRequestBuilder, this.$contentType);
            Object obj = this.$body;
            if (obj == null) {
                httpRequestBuilder.setBody(NullBody.INSTANCE);
                l.k();
                throw null;
            }
            if (obj instanceof OutgoingContent) {
                httpRequestBuilder.setBody(obj);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(obj);
                l.k();
                throw null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    /* renamed from: io.github.jan.supabase.network.SupabaseHttpClient$put$3, reason: invalid class name and case insensitive filesystem */
    public static final class C11293 implements k {
        final /* synthetic */ k $builder;

        public C11293(k kVar) {
            this.$builder = kVar;
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return C.a;
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            l.f("$this$request", httpRequestBuilder);
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
            this.$builder.invoke(httpRequestBuilder);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    /* renamed from: io.github.jan.supabase.network.SupabaseHttpClient$put$6, reason: invalid class name and case insensitive filesystem */
    public static final class C11316 implements k {
        final /* synthetic */ T $body;
        final /* synthetic */ k $builder;
        final /* synthetic */ ContentType $contentType;

        public C11316(k kVar, ContentType contentType, T t7) {
            this.$builder = kVar;
            this.$contentType = contentType;
            this.$body = t7;
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return C.a;
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            l.f("$this$request", httpRequestBuilder);
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
            this.$builder.invoke(httpRequestBuilder);
            HttpMessagePropertiesKt.contentType(httpRequestBuilder, this.$contentType);
            Object obj = this.$body;
            if (obj == null) {
                httpRequestBuilder.setBody(NullBody.INSTANCE);
                l.k();
                throw null;
            }
            if (obj instanceof OutgoingContent) {
                httpRequestBuilder.setBody(obj);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(obj);
                l.k();
                throw null;
            }
        }
    }

    private final Object delete$$forInline(String str, k kVar, c<? super HttpResponse> cVar) {
        return request(str, new AnonymousClass3(kVar), cVar);
    }

    public static /* synthetic */ Object delete$default(SupabaseHttpClient supabaseHttpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.delete.2
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        return supabaseHttpClient.request(str, new AnonymousClass3(kVar), cVar);
    }

    public static Object deleteJson$default(SupabaseHttpClient supabaseHttpClient, String str, Object obj, k kVar, c cVar, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteJson");
        }
        if ((i7 & 4) != 0) {
            C11152 c11152 = new k() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.deleteJson.2
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((HttpRequestBuilder) obj3);
                    return C.a;
                }
            };
        }
        ContentType.Application.INSTANCE.getJson();
        l.k();
        throw null;
    }

    private final Object get$$forInline(String str, k kVar, c<? super HttpResponse> cVar) {
        return request(str, new C11173(kVar), cVar);
    }

    public static /* synthetic */ Object get$default(SupabaseHttpClient supabaseHttpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.get.2
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        return supabaseHttpClient.request(str, new C11173(kVar), cVar);
    }

    private final Object patch$$forInline(String str, k kVar, c<? super HttpResponse> cVar) {
        return request(str, new C11193(kVar), cVar);
    }

    public static /* synthetic */ Object patch$default(SupabaseHttpClient supabaseHttpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch");
        }
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.patch.2
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        return supabaseHttpClient.request(str, new C11193(kVar), cVar);
    }

    public static Object patchJson$default(SupabaseHttpClient supabaseHttpClient, String str, Object obj, k kVar, c cVar, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patchJson");
        }
        if ((i7 & 4) != 0) {
            C11222 c11222 = new k() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.patchJson.2
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((HttpRequestBuilder) obj3);
                    return C.a;
                }
            };
        }
        ContentType.Application.INSTANCE.getJson();
        l.k();
        throw null;
    }

    private final Object post$$forInline(String str, k kVar, c<? super HttpResponse> cVar) {
        return request(str, new C11243(kVar), cVar);
    }

    public static /* synthetic */ Object post$default(SupabaseHttpClient supabaseHttpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.post.2
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        return supabaseHttpClient.request(str, new C11243(kVar), cVar);
    }

    public static Object postJson$default(SupabaseHttpClient supabaseHttpClient, String str, Object obj, k kVar, c cVar, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postJson");
        }
        if ((i7 & 4) != 0) {
            C11272 c11272 = new k() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.postJson.2
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((HttpRequestBuilder) obj3);
                    return C.a;
                }
            };
        }
        ContentType.Application.INSTANCE.getJson();
        l.k();
        throw null;
    }

    private final Object put$$forInline(String str, k kVar, c<? super HttpResponse> cVar) {
        return request(str, new C11293(kVar), cVar);
    }

    public static /* synthetic */ Object put$default(SupabaseHttpClient supabaseHttpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
        }
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.put.2
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        return supabaseHttpClient.request(str, new C11293(kVar), cVar);
    }

    public static Object putJson$default(SupabaseHttpClient supabaseHttpClient, String str, Object obj, k kVar, c cVar, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putJson");
        }
        if ((i7 & 4) != 0) {
            C11322 c11322 = new k() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.putJson.2
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((HttpRequestBuilder) obj3);
                    return C.a;
                }
            };
        }
        ContentType.Application.INSTANCE.getJson();
        l.k();
        throw null;
    }

    public final Object delete(String str, k kVar, c<? super HttpResponse> cVar) {
        return request(str, new AnonymousClass3(kVar), cVar);
    }

    public final <T> Object deleteJson(String str, T t7, k kVar, c<? super HttpResponse> cVar) {
        ContentType.Application.INSTANCE.getJson();
        l.k();
        throw null;
    }

    public final Object get(String str, k kVar, c<? super HttpResponse> cVar) {
        return request(str, new C11173(kVar), cVar);
    }

    public final Object patch(String str, k kVar, c<? super HttpResponse> cVar) {
        return request(str, new C11193(kVar), cVar);
    }

    public final <T> Object patchJson(String str, T t7, k kVar, c<? super HttpResponse> cVar) {
        ContentType.Application.INSTANCE.getJson();
        l.k();
        throw null;
    }

    public final Object post(String str, k kVar, c<? super HttpResponse> cVar) {
        return request(str, new C11243(kVar), cVar);
    }

    public final <T> Object postJson(String str, T t7, k kVar, c<? super HttpResponse> cVar) {
        ContentType.Application.INSTANCE.getJson();
        l.k();
        throw null;
    }

    public abstract Object prepareRequest(String str, k kVar, c<? super HttpStatement> cVar);

    public final Object put(String str, k kVar, c<? super HttpResponse> cVar) {
        return request(str, new C11293(kVar), cVar);
    }

    public final <T> Object putJson(String str, T t7, k kVar, c<? super HttpResponse> cVar) {
        ContentType.Application.INSTANCE.getJson();
        l.k();
        throw null;
    }

    public abstract Object request(String str, k kVar, c<? super HttpResponse> cVar);

    public static Object delete$default(SupabaseHttpClient supabaseHttpClient, String str, Object obj, ContentType contentType, k kVar, c cVar, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i7 & 4) != 0) {
            ContentType.INSTANCE.getAny();
        }
        if ((i7 & 8) != 0) {
            AnonymousClass5 anonymousClass5 = new k() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.delete.5
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((HttpRequestBuilder) obj3);
                    return C.a;
                }
            };
        }
        l.k();
        throw null;
    }

    public static Object patch$default(SupabaseHttpClient supabaseHttpClient, String str, Object obj, ContentType contentType, k kVar, c cVar, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch");
        }
        if ((i7 & 4) != 0) {
            ContentType.INSTANCE.getAny();
        }
        if ((i7 & 8) != 0) {
            C11205 c11205 = new k() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.patch.5
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((HttpRequestBuilder) obj3);
                    return C.a;
                }
            };
        }
        l.k();
        throw null;
    }

    public static Object post$default(SupabaseHttpClient supabaseHttpClient, String str, Object obj, ContentType contentType, k kVar, c cVar, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
        if ((i7 & 4) != 0) {
            ContentType.INSTANCE.getAny();
        }
        if ((i7 & 8) != 0) {
            C11255 c11255 = new k() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.post.5
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((HttpRequestBuilder) obj3);
                    return C.a;
                }
            };
        }
        l.k();
        throw null;
    }

    public static Object put$default(SupabaseHttpClient supabaseHttpClient, String str, Object obj, ContentType contentType, k kVar, c cVar, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
        }
        if ((i7 & 4) != 0) {
            ContentType.INSTANCE.getAny();
        }
        if ((i7 & 8) != 0) {
            C11305 c11305 = new k() { // from class: io.github.jan.supabase.network.SupabaseHttpClient.put.5
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((HttpRequestBuilder) obj3);
                    return C.a;
                }
            };
        }
        l.k();
        throw null;
    }

    public final <T> Object delete(String str, T t7, ContentType contentType, k kVar, c<? super HttpResponse> cVar) {
        l.k();
        throw null;
    }

    public final <T> Object patch(String str, T t7, ContentType contentType, k kVar, c<? super HttpResponse> cVar) {
        l.k();
        throw null;
    }

    public final <T> Object post(String str, T t7, ContentType contentType, k kVar, c<? super HttpResponse> cVar) {
        l.k();
        throw null;
    }

    public final <T> Object put(String str, T t7, ContentType contentType, k kVar, c<? super HttpResponse> cVar) {
        l.k();
        throw null;
    }
}
