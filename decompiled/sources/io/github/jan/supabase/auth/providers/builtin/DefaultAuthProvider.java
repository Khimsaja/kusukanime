package io.github.jan.supabase.auth.providers.builtin;

import O3.C;
import O3.j;
import U3.e;
import V5.h;
import V5.i;
import Y5.b;
import Z5.o0;
import a6.x;
import e4.k;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.auth.providers.AuthProvider;
import io.github.jan.supabase.auth.providers.builtin.Email;
import io.github.jan.supabase.auth.providers.builtin.IDToken;
import io.github.jan.supabase.auth.providers.builtin.Phone;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;
import l4.InterfaceC1425d;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001\u001dJ_\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0019\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013¢\u0006\u0002\b\u0014H\u0096@¢\u0006\u0002\u0010\u0015Ja\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00020\u000b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0019\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013¢\u0006\u0002\b\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0019H'¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00192\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0014H'R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u001e\u001f ¨\u0006!À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider;", "C", "R", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "grantType", "", "getGrantType", "()Ljava/lang/String;", "login", "", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "onSuccess", "Lkotlin/Function2;", "Lio/github/jan/supabase/auth/user/UserSession;", "Lkotlin/coroutines/Continuation;", "", "redirectUrl", "config", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/SupabaseClient;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "decodeResult", "json", "Lkotlinx/serialization/json/JsonObject;", "(Lkotlinx/serialization/json/JsonObject;)Ljava/lang/Object;", "encodeCredentials", "credentials", "Config", "Lio/github/jan/supabase/auth/providers/builtin/Email;", "Lio/github/jan/supabase/auth/providers/builtin/IDToken;", "Lio/github/jan/supabase/auth/providers/builtin/Phone;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DefaultAuthProvider<C, R> extends AuthProvider<C, R> {

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB!\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007R&\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0001\u0003\u001f !¨\u0006\""}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;", "", "captchaToken", "", "data", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCaptchaToken$annotations", "()V", "getCaptchaToken", "()Ljava/lang/String;", "setCaptchaToken", "(Ljava/lang/String;)V", "getData", "()Lkotlinx/serialization/json/JsonObject;", "setData", "(Lkotlinx/serialization/json/JsonObject;)V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Lio/github/jan/supabase/auth/providers/builtin/Email$Config;", "Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;", "Lio/github/jan/supabase/auth/providers/builtin/Phone$Config;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i
    public static abstract class Config {
        private String captchaToken;
        private c data;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final O3.i $cachedSerializer$delegate = z1.c.B(j.f7525k, new J3.a(11));

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Config.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        public /* synthetic */ Config(String str, c cVar, f fVar) {
            this(str, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            z zVar = y.a;
            return new V5.f(zVar.b(Config.class), new InterfaceC1425d[]{zVar.b(Email.Config.class), zVar.b(IDToken.Config.class), zVar.b(Phone.Config.class)}, new KSerializer[]{Email$Config$$serializer.INSTANCE, IDToken$Config$$serializer.INSTANCE, Phone$Config$$serializer.INSTANCE}, new Annotation[0]);
        }

        @h("gotrue_meta_security")
        @i(with = CaptchaTokenSerializer.class)
        public static /* synthetic */ void getCaptchaToken$annotations() {
        }

        public static final /* synthetic */ void write$Self(Config config, b bVar, SerialDescriptor serialDescriptor) {
            if (bVar.z(serialDescriptor) || config.captchaToken != null) {
                bVar.F(serialDescriptor, 0, CaptchaTokenSerializer.INSTANCE, config.captchaToken);
            }
            if (!bVar.z(serialDescriptor) && config.data == null) {
                return;
            }
            bVar.F(serialDescriptor, 1, x.a, config.data);
        }

        public final String getCaptchaToken() {
            return this.captchaToken;
        }

        public final c getData() {
            return this.data;
        }

        public final void setCaptchaToken(String str) {
            this.captchaToken = str;
        }

        public final void setData(c cVar) {
            this.data = cVar;
        }

        public /* synthetic */ Config(int i7, String str, c cVar, o0 o0Var) {
            if ((i7 & 1) == 0) {
                this.captchaToken = null;
            } else {
                this.captchaToken = str;
            }
            if ((i7 & 2) == 0) {
                this.data = null;
            } else {
                this.data = cVar;
            }
        }

        private Config(String str, c cVar) {
            this.captchaToken = str;
            this.data = cVar;
        }

        public /* synthetic */ Config(String str, c cVar, int i7, f fVar) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : cVar, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <C, R> Object login(DefaultAuthProvider<C, R> defaultAuthProvider, SupabaseClient supabaseClient, n nVar, String str, k kVar, S3.c<? super C> cVar) {
            return DefaultAuthProvider.super.login(supabaseClient, nVar, str, kVar, cVar);
        }

        @Deprecated
        public static <C, R> Object signUp(DefaultAuthProvider<C, R> defaultAuthProvider, SupabaseClient supabaseClient, n nVar, String str, k kVar, S3.c<? super R> cVar) {
            return DefaultAuthProvider.super.signUp(supabaseClient, nVar, str, kVar, cVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider", f = "DefaultAuthProvider.kt", l = {122, 128, 66}, m = "login$suspendImpl", v = 1)
    /* renamed from: io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider$login$1, reason: invalid class name */
    public static final class AnonymousClass1<C, R> extends U3.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DefaultAuthProvider<C, R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultAuthProvider<C, R> defaultAuthProvider, S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = defaultAuthProvider;
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultAuthProvider.login$suspendImpl(this.this$0, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider", f = "DefaultAuthProvider.kt", l = {82, 125, 131, 102}, m = "signUp$suspendImpl", v = 1)
    /* renamed from: io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider$signUp$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11131<C, R> extends U3.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DefaultAuthProvider<C, R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11131(DefaultAuthProvider<C, R> defaultAuthProvider, S3.c<? super C11131> cVar) {
            super(cVar);
            this.this$0 = defaultAuthProvider;
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultAuthProvider.signUp$suspendImpl(this.this$0, null, null, null, null, this);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(3:13|35|36)(2:14|15))(2:16|(1:32)(2:37|38)))(1:17))(2:18|(3:20|(0)|34)(2:39|40))|23|41|24|27|(2:30|(0)(0))|34) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0145, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0197, code lost:
    
        if (r8.invoke(r13, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <C, R> java.lang.Object login$suspendImpl(io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider<C, R> r8, io.github.jan.supabase.SupabaseClient r9, e4.n r10, final java.lang.String r11, e4.k r12, S3.c<? super O3.C> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider.login$suspendImpl(io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider, io.github.jan.supabase.SupabaseClient, e4.n, java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0230 A[PHI: r0 r1 r2
      0x0230: PHI (r0v15 e4.n) = (r0v14 e4.n), (r0v74 e4.n) binds: [B:55:0x022d, B:21:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r1v12 io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider<C, R>) = 
      (r1v11 io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider<C, R>)
      (r1v32 io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider<C, R>)
     binds: [B:55:0x022d, B:21:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r2v13 java.lang.Object) = (r2v12 java.lang.Object), (r2v1 java.lang.Object) binds: [B:55:0x022d, B:21:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0283 A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:15:0x0068, B:64:0x0279, B:66:0x0283, B:68:0x0293, B:67:0x0288), top: B:92:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0288 A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:15:0x0068, B:64:0x0279, B:66:0x0283, B:68:0x0293, B:67:0x0288), top: B:92:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <C, R> java.lang.Object signUp$suspendImpl(io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider<C, R> r16, io.github.jan.supabase.SupabaseClient r17, e4.n r18, java.lang.String r19, e4.k r20, S3.c<? super R> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider.signUp$suspendImpl(io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider, io.github.jan.supabase.SupabaseClient, e4.n, java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    @SupabaseInternal
    R decodeResult(c cVar);

    @SupabaseInternal
    c encodeCredentials(k kVar);

    String getGrantType();

    @Override // io.github.jan.supabase.auth.providers.AuthProvider
    default Object login(SupabaseClient supabaseClient, n nVar, String str, k kVar, S3.c<? super C> cVar) {
        return login$suspendImpl(this, supabaseClient, nVar, str, kVar, cVar);
    }

    @Override // io.github.jan.supabase.auth.providers.AuthProvider
    default Object signUp(SupabaseClient supabaseClient, n nVar, String str, k kVar, S3.c<? super R> cVar) {
        return signUp$suspendImpl(this, supabaseClient, nVar, str, kVar, cVar);
    }
}
