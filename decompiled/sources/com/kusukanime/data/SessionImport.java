package com.kusukanime.data;

import A3.e;
import O3.C;
import P3.y;
import P3.z;
import a6.d;
import a6.h;
import a6.l;
import a6.m;
import a6.v;
import android.content.Context;
import android.util.Base64;
import io.github.jan.supabase.auth.user.UserSession;
import io.ktor.client.utils.CIOKt;
import io.ktor.http.LinkHeader;
import java.util.List;
import kotlin.Metadata;
import q0.c;
import z5.AbstractC2510o;
import z5.AbstractC2517v;
import z5.C2496a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/kusukanime/data/SessionImport;", "", "<init>", "()V", "json", "Lkotlinx/serialization/json/Json;", "importWithFallback", "Lio/github/jan/supabase/auth/user/UserSession;", "ctx", "Landroid/content/Context;", "sb", "Lio/github/jan/supabase/SupabaseClient;", "access", "", "refresh", "(Landroid/content/Context;Lio/github/jan/supabase/SupabaseClient;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildSession", "decodeJwt", "Lkotlinx/serialization/json/JsonObject;", "token", "log", "", "msg", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionImport {
    public static final SessionImport INSTANCE = new SessionImport();
    private static final d json = c.c(new e(19));
    public static final int $stable = 8;

    @U3.e(c = "com.kusukanime.data.SessionImport", f = "SessionImport.kt", l = {53, 71, 95}, m = "importWithFallback", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.SessionImport$importWithFallback$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionImport.this.importWithFallback(null, null, null, null, this);
        }
    }

    private SessionImport() {
    }

    private final UserSession buildSession(String access, String refresh) {
        long jCurrentTimeMillis;
        kotlinx.serialization.json.b bVar;
        String strA;
        Long lV;
        kotlinx.serialization.json.b bVar2;
        kotlinx.serialization.json.b bVar3;
        kotlinx.serialization.json.c cVarDecodeJwt = decodeJwt(access);
        String strA2 = (cVarDecodeJwt == null || (bVar3 = (kotlinx.serialization.json.b) cVarDecodeJwt.get("sub")) == null) ? null : l.f(bVar3).a();
        if (strA2 == null) {
            strA2 = "";
        }
        String strA3 = (cVarDecodeJwt == null || (bVar2 = (kotlinx.serialization.json.b) cVarDecodeJwt.get("email")) == null) ? null : l.f(bVar2).a();
        String str = strA3 != null ? strA3 : "";
        long jLongValue = (cVarDecodeJwt == null || (bVar = (kotlinx.serialization.json.b) cVarDecodeJwt.get("exp")) == null || (strA = l.f(bVar).a()) == null || (lV = AbstractC2517v.V(strA)) == null) ? 0L : lV.longValue();
        kotlinx.serialization.json.b bVar4 = cVarDecodeJwt != null ? (kotlinx.serialization.json.b) cVarDecodeJwt.get("user_metadata") : null;
        kotlinx.serialization.json.c cVar = bVar4 instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVar4 : null;
        z zVar = z.f7780k;
        if (cVar == null) {
            cVar = new kotlinx.serialization.json.c(zVar);
        }
        Object obj = cVarDecodeJwt != null ? (kotlinx.serialization.json.b) cVarDecodeJwt.get("app_metadata") : null;
        kotlinx.serialization.json.c cVar2 = obj instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) obj : null;
        if (cVar2 == null) {
            cVar2 = new kotlinx.serialization.json.c(zVar);
        }
        if (jLongValue > 0) {
            jCurrentTimeMillis = jLongValue - (System.currentTimeMillis() / CIOKt.DEFAULT_HTTP_POOL_SIZE);
            if (jCurrentTimeMillis < 60) {
                jCurrentTimeMillis = 60;
            }
        } else {
            jCurrentTimeMillis = 3600;
        }
        v vVar = new v();
        n6.d.V("id", strA2, vVar);
        n6.d.V("aud", "authenticated", vVar);
        n6.d.V("role", "authenticated", vVar);
        n6.d.V("email", str, vVar);
        vVar.b("app_metadata", cVar2);
        vVar.b("user_metadata", cVar);
        vVar.b("identities", new kotlinx.serialization.json.a(y.f7779k));
        kotlinx.serialization.json.c cVarA = vVar.a();
        v vVar2 = new v();
        n6.d.V("access_token", access, vVar2);
        n6.d.V("refresh_token", refresh, vVar2);
        vVar2.b("expires_in", l.a(Long.valueOf(jCurrentTimeMillis)));
        n6.d.V("token_type", "bearer", vVar2);
        vVar2.b("user", cVarA);
        n6.d.V(LinkHeader.Parameters.Type, "oauth", vVar2);
        return (UserSession) json.a(UserSession.INSTANCE.serializer(), vVar2.a());
    }

    private final kotlinx.serialization.json.c decodeJwt(String str) {
        try {
            List listU0 = AbstractC2510o.u0(str, new String[]{"."}, 0, 6);
            if (listU0.size() < 2) {
                return null;
            }
            byte[] bArrDecode = Base64.decode((String) listU0.get(1), 11);
            kotlin.jvm.internal.l.e("decode(...)", bArrDecode);
            String str2 = new String(bArrDecode, C2496a.f19036b);
            d dVar = json;
            dVar.getClass();
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) dVar.b(str2, m.a);
            if (bVar instanceof kotlinx.serialization.json.c) {
                return (kotlinx.serialization.json.c) bVar;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C json$lambda$0(h hVar) {
        kotlin.jvm.internal.l.f("$this$Json", hVar);
        hVar.f10466c = true;
        hVar.f10467d = true;
        hVar.f10465b = false;
        return C.a;
    }

    private final void log(Context ctx, String msg) {
        try {
            CrashLog.INSTANCE.saveDiag(ctx, "oauth-import: " + msg);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(1:(1:(9:14|130|15|16|98|(1:107)(1:104)|(3:109|(1:111)(1:112)|(2:117|144))|118|145)(2:19|20))(13:21|132|22|23|124|63|(1:72)(1:69)|(3:74|(1:76)(1:77)|(2:82|83))|(1:85)(1:86)|87|88|125|95))(3:26|142|27))(17:31|136|32|33|134|34|35|126|36|37|122|38|39|140|40|(1:43)|97)|44|45|138|57|58|128|59|(11:62|124|63|(1:65)|72|(0)|(0)(0)|87|88|125|95)|97|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0185, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0186, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0187, code lost:
    
        r11 = r16;
        r9 = r8;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018e, code lost:
    
        r16 = r10;
        r19 = r15;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d5, code lost:
    
        if (r7.importSession(r0, true, r8, r12) != r6) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0138 A[Catch: all -> 0x0132, TryCatch #1 {all -> 0x0132, blocks: (B:63:0x0117, B:65:0x0121, B:67:0x0127, B:69:0x012d, B:74:0x0138, B:76:0x013e, B:79:0x0147, B:82:0x014e, B:87:0x0166), top: B:124:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object importWithFallback(android.content.Context r19, io.github.jan.supabase.SupabaseClient r20, java.lang.String r21, java.lang.String r22, S3.c<? super io.github.jan.supabase.auth.user.UserSession> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.SessionImport.importWithFallback(android.content.Context, io.github.jan.supabase.SupabaseClient, java.lang.String, java.lang.String, S3.c):java.lang.Object");
    }
}
