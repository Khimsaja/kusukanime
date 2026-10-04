package io.github.jan.supabase.auth;

import A5.g;
import H5.A;
import H5.AbstractC0281w;
import H5.D;
import H5.InterfaceC0265f0;
import K5.F;
import K5.G;
import K5.H;
import K5.I;
import K5.J;
import K5.M;
import K5.N;
import K5.W;
import K5.Y;
import O3.C;
import P3.q;
import P3.r;
import P3.y;
import U3.j;
import a6.v;
import b1.AbstractC0703b;
import e4.k;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.auth.Auth;
import io.github.jan.supabase.auth.GoTrueErrorResponse;
import io.github.jan.supabase.auth.OtpType;
import io.github.jan.supabase.auth.admin.AdminApi;
import io.github.jan.supabase.auth.admin.AdminApiImpl;
import io.github.jan.supabase.auth.event.AuthEvent;
import io.github.jan.supabase.auth.exception.AuthRestException;
import io.github.jan.supabase.auth.exception.AuthSessionMissingException;
import io.github.jan.supabase.auth.exception.AuthWeakPasswordException;
import io.github.jan.supabase.auth.mfa.MfaApi;
import io.github.jan.supabase.auth.mfa.MfaApiImpl;
import io.github.jan.supabase.auth.providers.AuthProvider;
import io.github.jan.supabase.auth.providers.ExternalAuthConfigDefaults;
import io.github.jan.supabase.auth.providers.OAuthProvider;
import io.github.jan.supabase.auth.status.RefreshFailureCause;
import io.github.jan.supabase.auth.status.SessionSource;
import io.github.jan.supabase.auth.status.SessionStatus;
import io.github.jan.supabase.auth.user.Identity;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.auth.user.UserSession;
import io.github.jan.supabase.exceptions.RestException;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.LinkHeader;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010J\u001a\u00020KH\u0016J]\u0010L\u001a\u00020K\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N\"\u0014\b\u0002\u0010O*\u000e\u0012\u0004\u0012\u0002HM\u0012\u0004\u0012\u0002HN0P2\u0006\u0010Q\u001a\u0002HO2\b\u0010R\u001a\u0004\u0018\u00010G2\u0019\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u0002HM\u0012\u0004\u0012\u00020K\u0018\u00010S¢\u0006\u0002\bTH\u0096@¢\u0006\u0002\u0010UJ\"\u0010V\u001a\u00020K2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010Y\u001a\u0004\u0018\u00010GH\u0096@¢\u0006\u0002\u0010ZJ_\u0010[\u001a\u0004\u0018\u0001HN\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N\"\u0014\b\u0002\u0010O*\u000e\u0012\u0004\u0012\u0002HM\u0012\u0004\u0012\u0002HN0P2\u0006\u0010Q\u001a\u0002HO2\b\u0010R\u001a\u0004\u0018\u00010G2\u0019\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u0002HM\u0012\u0004\u0012\u00020K\u0018\u00010S¢\u0006\u0002\bTH\u0096@¢\u0006\u0002\u0010UJ;\u0010\\\u001a\u0004\u0018\u00010G2\u0006\u0010Q\u001a\u00020]2\b\u0010R\u001a\u0004\u0018\u00010G2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020K0S¢\u0006\u0002\bTH\u0096@¢\u0006\u0002\u0010_J\u001e\u0010`\u001a\u00020K2\u0006\u0010a\u001a\u00020G2\u0006\u0010b\u001a\u00020<H\u0096@¢\u0006\u0002\u0010cJ1\u0010d\u001a\u00020e2\b\u0010R\u001a\u0004\u0018\u00010G2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020K0S¢\u0006\u0002\bTH\u0096@¢\u0006\u0002\u0010gJ9\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020<2\b\u0010R\u001a\u0004\u0018\u00010G2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020K0S¢\u0006\u0002\bTH\u0096@¢\u0006\u0002\u0010lJ/\u0010m\u001a\u00020K2\u0006\u0010n\u001a\u00020G2\u0017\u0010o\u001a\u0013\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020K0S¢\u0006\u0002\bTH\u0082@¢\u0006\u0002\u0010gJ(\u0010q\u001a\u00020K2\u0006\u0010n\u001a\u00020r2\u0006\u0010s\u001a\u00020G2\b\u0010Y\u001a\u0004\u0018\u00010GH\u0096@¢\u0006\u0002\u0010tJ(\u0010u\u001a\u00020K2\u0006\u0010n\u001a\u00020v2\u0006\u0010w\u001a\u00020G2\b\u0010Y\u001a\u0004\u0018\u00010GH\u0096@¢\u0006\u0002\u0010xJ*\u0010y\u001a\u00020K2\u0006\u0010s\u001a\u00020G2\b\u0010R\u001a\u0004\u0018\u00010G2\b\u0010Y\u001a\u0004\u0018\u00010GH\u0096@¢\u0006\u0002\u0010zJ\u000e\u0010{\u001a\u00020KH\u0096@¢\u0006\u0002\u0010|J\u0017\u0010}\u001a\u00020K2\u0006\u0010~\u001a\u00020\u007fH\u0096@¢\u0006\u0003\u0010\u0080\u0001JG\u0010\u0081\u0001\u001a\u00020K2\u0006\u0010n\u001a\u00020G2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010G2\b\u0010Y\u001a\u0004\u0018\u00010G2\u0018\u0010\u0083\u0001\u001a\u0013\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020K0S¢\u0006\u0002\bTH\u0082@¢\u0006\u0003\u0010\u0084\u0001J3\u0010\u0085\u0001\u001a\u00020K2\u0006\u0010n\u001a\u00020r2\u0006\u0010s\u001a\u00020G2\u0007\u0010\u0082\u0001\u001a\u00020G2\b\u0010Y\u001a\u0004\u0018\u00010GH\u0096@¢\u0006\u0003\u0010\u0086\u0001J*\u0010\u0085\u0001\u001a\u00020K2\u0006\u0010n\u001a\u00020r2\u0007\u0010\u0087\u0001\u001a\u00020G2\b\u0010Y\u001a\u0004\u0018\u00010GH\u0096@¢\u0006\u0002\u0010tJ3\u0010\u0088\u0001\u001a\u00020K2\u0006\u0010n\u001a\u00020v2\u0006\u0010w\u001a\u00020G2\u0007\u0010\u0082\u0001\u001a\u00020G2\b\u0010Y\u001a\u0004\u0018\u00010GH\u0096@¢\u0006\u0003\u0010\u0089\u0001J\u0019\u0010\u008a\u0001\u001a\u00020i2\u0007\u0010\u008b\u0001\u001a\u00020GH\u0096@¢\u0006\u0003\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020i2\u0007\u0010\u008e\u0001\u001a\u00020<H\u0096@¢\u0006\u0003\u0010\u008f\u0001J\"\u0010\u0090\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0092\u0001\u001a\u00020G2\u0007\u0010\u0093\u0001\u001a\u00020<H\u0096@¢\u0006\u0002\u0010cJ\u001a\u0010\u0094\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0095\u0001\u001a\u00020GH\u0096@¢\u0006\u0003\u0010\u008c\u0001J\u000f\u0010\u0096\u0001\u001a\u00020KH\u0096@¢\u0006\u0002\u0010|J-\u0010\u0097\u0001\u001a\u00020K2\b\u0010\u0098\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0099\u0001\u001a\u00020<2\b\u0010\u009a\u0001\u001a\u00030\u009b\u0001H\u0096@¢\u0006\u0003\u0010\u009c\u0001J{\u0010\u009d\u0001\u001a\u00020K2\u001f\u0010\u009e\u0001\u001a\u001a\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020K0\u009f\u0001\u0012\u0007\u0012\u0005\u0018\u00010 \u00010S2\u001f\u0010¡\u0001\u001a\u001a\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020K0\u009f\u0001\u0012\u0007\u0012\u0005\u0018\u00010 \u00010S2'\u0010¢\u0001\u001a\"\b\u0001\u0012\u0005\u0012\u00030¤\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020K0\u009f\u0001\u0012\u0007\u0012\u0005\u0018\u00010 \u00010£\u0001H\u0082@¢\u0006\u0003\u0010¥\u0001J\u001d\u0010¦\u0001\u001a\u00020K2\b\u0010\u0098\u0001\u001a\u00030\u0091\u00012\b\u0010§\u0001\u001a\u00030¤\u0001H\u0002J\u001a\u0010¨\u0001\u001a\u00020K2\b\u0010\u0098\u0001\u001a\u00030\u0091\u0001H\u0082@¢\u0006\u0003\u0010©\u0001J%\u0010ª\u0001\u001a\u00020K2\b\u0010\u0098\u0001\u001a\u00030\u0091\u00012\t\b\u0002\u0010\u0099\u0001\u001a\u00020<H\u0082@¢\u0006\u0003\u0010«\u0001J\u000f\u0010¬\u0001\u001a\u00020KH\u0096@¢\u0006\u0002\u0010|J\t\u0010\u00ad\u0001\u001a\u00020KH\u0016J\u0019\u0010®\u0001\u001a\u00020<2\u0007\u0010\u0099\u0001\u001a\u00020<H\u0096@¢\u0006\u0003\u0010\u008f\u0001J\u000f\u0010¯\u0001\u001a\u00020KH\u0096@¢\u0006\u0002\u0010|J\u001b\u0010°\u0001\u001a\u00030±\u00012\b\u0010²\u0001\u001a\u00030³\u0001H\u0096@¢\u0006\u0003\u0010´\u0001J \u0010µ\u0001\u001a\u0005\u0018\u00010±\u00012\b\u0010¶\u0001\u001a\u00030·\u00012\b\u0010²\u0001\u001a\u00030³\u0001H\u0002J>\u0010¸\u0001\u001a\u00020G2\u0006\u0010Q\u001a\u00020]2\b\u0010R\u001a\u0004\u0018\u00010G2\u0007\u0010¹\u0001\u001a\u00020G2\u0018\u0010º\u0001\u001a\u0013\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020K0S¢\u0006\u0002\bTH\u0016J\u000f\u0010»\u0001\u001a\u00020KH\u0096@¢\u0006\u0002\u0010|J\u000f\u0010¼\u0001\u001a\u00020KH\u0096@¢\u0006\u0002\u0010|J\u0012\u0010½\u0001\u001a\u00020K2\u0007\u0010¾\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010¿\u0001\u001a\u00020K2\u0007\u0010À\u0001\u001a\u00020\u0015H\u0016J\u000b\u0010Á\u0001\u001a\u0004\u0018\u00010GH\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u000202X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010=R\u0014\u0010>\u001a\u00020?X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006Â\u0001"}, d2 = {"Lio/github/jan/supabase/auth/AuthImpl;", "Lio/github/jan/supabase/auth/Auth;", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "config", "Lio/github/jan/supabase/auth/AuthConfig;", "<init>", "(Lio/github/jan/supabase/SupabaseClient;Lio/github/jan/supabase/auth/AuthConfig;)V", "getSupabaseClient", "()Lio/github/jan/supabase/SupabaseClient;", "getConfig", "()Lio/github/jan/supabase/auth/AuthConfig;", "_sessionStatus", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/github/jan/supabase/auth/status/SessionStatus;", "sessionStatus", "Lkotlinx/coroutines/flow/StateFlow;", "getSessionStatus", "()Lkotlinx/coroutines/flow/StateFlow;", "_events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lio/github/jan/supabase/auth/event/AuthEvent;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "authScope", "Lkotlinx/coroutines/CoroutineScope;", "getAuthScope$auth_kt_release$annotations", "()V", "getAuthScope$auth_kt_release", "()Lkotlinx/coroutines/CoroutineScope;", "sessionManager", "Lio/github/jan/supabase/auth/SessionManager;", "getSessionManager", "()Lio/github/jan/supabase/auth/SessionManager;", "codeVerifierCache", "Lio/github/jan/supabase/auth/CodeVerifierCache;", "getCodeVerifierCache", "()Lio/github/jan/supabase/auth/CodeVerifierCache;", "api", "Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "getApi$auth_kt_release$annotations", "getApi$auth_kt_release", "()Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "admin", "Lio/github/jan/supabase/auth/admin/AdminApi;", "getAdmin", "()Lio/github/jan/supabase/auth/admin/AdminApi;", "mfa", "Lio/github/jan/supabase/auth/mfa/MfaApi;", "getMfa", "()Lio/github/jan/supabase/auth/mfa/MfaApi;", "sessionJob", "Lkotlinx/coroutines/Job;", "getSessionJob", "()Lkotlinx/coroutines/Job;", "setSessionJob", "(Lkotlinx/coroutines/Job;)V", "isAutoRefreshRunning", "", "()Z", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "apiVersion", "", "getApiVersion", "()I", "pluginKey", "", "getPluginKey", "()Ljava/lang/String;", "init", "", "signInWith", "C", "R", "Provider", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "provider", "redirectUrl", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/auth/providers/AuthProvider;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInAnonymously", "data", "Lkotlinx/serialization/json/JsonObject;", "captchaToken", "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUpWith", "linkIdentity", "Lio/github/jan/supabase/auth/providers/OAuthProvider;", "Lio/github/jan/supabase/auth/providers/ExternalAuthConfigDefaults;", "(Lio/github/jan/supabase/auth/providers/OAuthProvider;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unlinkIdentity", "identityId", "updateLocalUser", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSSOUrl", "Lio/github/jan/supabase/auth/providers/builtin/SSO$Result;", "Lio/github/jan/supabase/auth/providers/builtin/SSO$Config;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "Lio/github/jan/supabase/auth/user/UserInfo;", "updateCurrentUser", "Lio/github/jan/supabase/auth/user/UserUpdateBuilder;", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resend", LinkHeader.Parameters.Type, "body", "Lkotlinx/serialization/json/JsonObjectBuilder;", "resendEmail", "Lio/github/jan/supabase/auth/OtpType$Email;", "email", "(Lio/github/jan/supabase/auth/OtpType$Email;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resendPhone", "Lio/github/jan/supabase/auth/OtpType$Phone;", "phone", "(Lio/github/jan/supabase/auth/OtpType$Phone;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetPasswordForEmail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reauthenticate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signOut", "scope", "Lio/github/jan/supabase/auth/SignOutScope;", "(Lio/github/jan/supabase/auth/SignOutScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verify", "token", "additionalData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyEmailOtp", "(Lio/github/jan/supabase/auth/OtpType$Email;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tokenHash", "verifyPhoneOtp", "(Lio/github/jan/supabase/auth/OtpType$Phone;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveUser", "jwt", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveUserForCurrentSession", "updateSession", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exchangeCodeForSession", "Lio/github/jan/supabase/auth/user/UserSession;", "code", "saveSession", "refreshSession", "refreshToken", "refreshCurrentSession", "importSession", SettingsSessionManager.SETTINGS_KEY, "autoRefresh", "source", "Lio/github/jan/supabase/auth/status/SessionSource;", "(Lio/github/jan/supabase/auth/user/UserSession;ZLio/github/jan/supabase/auth/status/SessionSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryImportingSession", "importRefreshedSession", "Lkotlin/coroutines/Continuation;", "", "retry", "updateStatus", "Lkotlin/Function2;", "Lio/github/jan/supabase/auth/status/RefreshFailureCause;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateStatusIfExpired", "reason", "delayBeforeExpiry", "(Lio/github/jan/supabase/auth/user/UserSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleExpiredSession", "(Lio/github/jan/supabase/auth/user/UserSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAutoRefreshForCurrentSession", "stopAutoRefreshForCurrentSession", "loadFromStorage", "close", "parseErrorResponse", "Lio/github/jan/supabase/exceptions/RestException;", "response", "Lio/ktor/client/statement/HttpResponse;", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkErrorCodes", "error", "Lio/github/jan/supabase/auth/GoTrueErrorResponse;", "getOAuthUrl", "url", "additionalConfig", "clearSession", "awaitInitialization", "setSessionStatus", "status", "emitEvent", "event", "preparePKCEIfEnabled", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthImpl implements Auth {
    private final F _events;
    private final G _sessionStatus;
    private final AdminApi admin;
    private final AuthenticatedSupabaseApi api;
    private final A authScope;
    private final CodeVerifierCache codeVerifierCache;
    private final AuthConfig config;
    private final J events;
    private final MfaApi mfa;
    private final SupabaseSerializer serializer;
    private InterfaceC0265f0 sessionJob;
    private final SessionManager sessionManager;
    private final W sessionStatus;
    private final SupabaseClient supabaseClient;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/github/jan/supabase/auth/status/SessionStatus;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$awaitInitialization$2", f = "AuthImpl.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$awaitInitialization$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(S3.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // e4.n
        public final Object invoke(SessionStatus sessionStatus, S3.c<? super Boolean> cVar) {
            return ((AnonymousClass2) create(sessionStatus, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            SessionStatus sessionStatus = (SessionStatus) this.L$0;
            T3.a aVar = T3.a.f9048k;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return Boolean.valueOf(!(sessionStatus instanceof SessionStatus.Initializing));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$checkErrorCodes$1", f = "AuthImpl.kt", l = {573}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$checkErrorCodes$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        int label;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return AuthImpl.this.new AnonymousClass1(cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                SupabaseLogger logger = Auth.INSTANCE.getLogger();
                LogLevel logLevel = LogLevel.ERROR;
                LogLevel level = logger.getLevel();
                if (level == null) {
                    level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
                }
                if (logLevel.compareTo(level) >= 0) {
                    logger.log(logLevel, (Throwable) null, "Received session not found api error. Clearing session...");
                }
                AuthImpl authImpl = AuthImpl.this;
                this.label = 1;
                if (authImpl.clearSession(this) == aVar) {
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

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {608, 609}, m = "clearSession", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$clearSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10821 extends U3.c {
        int label;
        /* synthetic */ Object result;

        public C10821(S3.c<? super C10821> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.clearSession(this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {381, 655, 662, 391, 393}, m = "exchangeCodeForSession", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$exchangeCodeForSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10831 extends U3.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C10831(S3.c<? super C10831> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.exchangeCodeForSession(null, false, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {518, 519}, m = "handleExpiredSession", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$handleExpiredSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10841 extends U3.c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C10841(S3.c<? super C10841> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.handleExpiredSession(null, false, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {427, 437, 444}, m = "importSession", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$importSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10851 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C10851(S3.c<? super C10851> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.importSession(null, false, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$importSession$11", f = "AuthImpl.kt", l = {451}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$importSession$11, reason: invalid class name */
    public static final class AnonymousClass11 extends j implements n {
        final /* synthetic */ UserSession $session;
        final /* synthetic */ SessionSource $source;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$importSession$11$1", f = "AuthImpl.kt", l = {453}, m = "invokeSuspend", v = 1)
        /* renamed from: io.github.jan.supabase.auth.AuthImpl$importSession$11$1, reason: invalid class name */
        public static final class AnonymousClass1 extends j implements n {
            final /* synthetic */ UserSession $session;
            final /* synthetic */ SessionSource $source;
            int label;
            final /* synthetic */ AuthImpl this$0;

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$importSession$11$1$1", f = "AuthImpl.kt", l = {454}, m = "invokeSuspend", v = 1)
            /* renamed from: io.github.jan.supabase.auth.AuthImpl$importSession$11$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00001 extends j implements k {
                final /* synthetic */ UserSession $session;
                int label;
                final /* synthetic */ AuthImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00001(AuthImpl authImpl, UserSession userSession, S3.c<? super C00001> cVar) {
                    super(1, cVar);
                    this.this$0 = authImpl;
                    this.$session = userSession;
                }

                @Override // U3.a
                public final S3.c<C> create(S3.c<?> cVar) {
                    return new C00001(this.this$0, this.$session, cVar);
                }

                @Override // e4.k
                public final Object invoke(S3.c<? super C> cVar) {
                    return ((C00001) create(cVar)).invokeSuspend(C.a);
                }

                @Override // U3.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    T3.a aVar = T3.a.f9048k;
                    int i7 = this.label;
                    if (i7 == 0) {
                        r.Y(obj);
                        AuthImpl authImpl = this.this$0;
                        UserSession userSession = this.$session;
                        this.label = 1;
                        if (AuthImpl.handleExpiredSession$default(authImpl, userSession, false, this, 2, null) == aVar) {
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

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$importSession$11$1$2", f = "AuthImpl.kt", l = {455}, m = "invokeSuspend", v = 1)
            /* renamed from: io.github.jan.supabase.auth.AuthImpl$importSession$11$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends j implements k {
                final /* synthetic */ UserSession $session;
                final /* synthetic */ SessionSource $source;
                int label;
                final /* synthetic */ AuthImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(AuthImpl authImpl, UserSession userSession, SessionSource sessionSource, S3.c<? super AnonymousClass2> cVar) {
                    super(1, cVar);
                    this.this$0 = authImpl;
                    this.$session = userSession;
                    this.$source = sessionSource;
                }

                @Override // U3.a
                public final S3.c<C> create(S3.c<?> cVar) {
                    return new AnonymousClass2(this.this$0, this.$session, this.$source, cVar);
                }

                @Override // e4.k
                public final Object invoke(S3.c<? super C> cVar) {
                    return ((AnonymousClass2) create(cVar)).invokeSuspend(C.a);
                }

                @Override // U3.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    T3.a aVar = T3.a.f9048k;
                    int i7 = this.label;
                    if (i7 == 0) {
                        r.Y(obj);
                        AuthImpl authImpl = this.this$0;
                        UserSession userSession = this.$session;
                        SessionSource sessionSource = this.$source;
                        this.label = 1;
                        if (Auth.importSession$default(authImpl, userSession, false, sessionSource, this, 2, null) == aVar) {
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

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/github/jan/supabase/auth/status/RefreshFailureCause;"}, k = 3, mv = {2, 2, 0}, xi = 48)
            @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$importSession$11$1$3", f = "AuthImpl.kt", l = {}, m = "invokeSuspend", v = 1)
            /* renamed from: io.github.jan.supabase.auth.AuthImpl$importSession$11$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends j implements n {
                final /* synthetic */ UserSession $session;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AuthImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(AuthImpl authImpl, UserSession userSession, S3.c<? super AnonymousClass3> cVar) {
                    super(2, cVar);
                    this.this$0 = authImpl;
                    this.$session = userSession;
                }

                @Override // U3.a
                public final S3.c<C> create(Object obj, S3.c<?> cVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$session, cVar);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // e4.n
                public final Object invoke(RefreshFailureCause refreshFailureCause, S3.c<? super C> cVar) {
                    return ((AnonymousClass3) create(refreshFailureCause, cVar)).invokeSuspend(C.a);
                }

                @Override // U3.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    RefreshFailureCause refreshFailureCause = (RefreshFailureCause) this.L$0;
                    T3.a aVar = T3.a.f9048k;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.Y(obj);
                    this.this$0.updateStatusIfExpired(this.$session, refreshFailureCause);
                    return C.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AuthImpl authImpl, UserSession userSession, SessionSource sessionSource, S3.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = authImpl;
                this.$session = userSession;
                this.$source = sessionSource;
            }

            @Override // U3.a
            public final S3.c<C> create(Object obj, S3.c<?> cVar) {
                return new AnonymousClass1(this.this$0, this.$session, this.$source, cVar);
            }

            @Override // e4.n
            public final Object invoke(A a, S3.c<? super C> cVar) {
                return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
            }

            @Override // U3.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                T3.a aVar = T3.a.f9048k;
                int i7 = this.label;
                if (i7 == 0) {
                    r.Y(obj);
                    AuthImpl authImpl = this.this$0;
                    C00001 c00001 = new C00001(authImpl, this.$session, null);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$session, this.$source, null);
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$session, null);
                    this.label = 1;
                    if (authImpl.tryImportingSession(c00001, anonymousClass2, anonymousClass3, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(UserSession userSession, SessionSource sessionSource, S3.c<? super AnonymousClass11> cVar) {
            super(2, cVar);
            this.$session = userSession;
            this.$source = sessionSource;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass11 anonymousClass11 = AuthImpl.this.new AnonymousClass11(this.$session, this.$source, cVar);
            anonymousClass11.L$0 = obj;
            return anonymousClass11;
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass11) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            A a = (A) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                AuthImpl authImpl = AuthImpl.this;
                UserSession userSession = this.$session;
                this.L$0 = a;
                this.label = 1;
                if (authImpl.delayBeforeExpiry(userSession, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            D.x(a, null, new AnonymousClass1(AuthImpl.this, this.$session, this.$source, null), 3);
            return C.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$importSession$6", f = "AuthImpl.kt", l = {438}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$importSession$6, reason: invalid class name */
    public static final class AnonymousClass6 extends j implements k {
        final /* synthetic */ UserSession $session;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(UserSession userSession, S3.c<? super AnonymousClass6> cVar) {
            super(1, cVar);
            this.$session = userSession;
        }

        @Override // U3.a
        public final S3.c<C> create(S3.c<?> cVar) {
            return AuthImpl.this.new AnonymousClass6(this.$session, cVar);
        }

        @Override // e4.k
        public final Object invoke(S3.c<? super C> cVar) {
            return ((AnonymousClass6) create(cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                AuthImpl authImpl = AuthImpl.this;
                UserSession userSession = this.$session;
                boolean alwaysAutoRefresh = authImpl.getConfig().getAlwaysAutoRefresh();
                this.label = 1;
                if (authImpl.handleExpiredSession(userSession, alwaysAutoRefresh, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$importSession$7", f = "AuthImpl.kt", l = {439}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$importSession$7, reason: invalid class name */
    public static final class AnonymousClass7 extends j implements k {
        final /* synthetic */ UserSession $session;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(UserSession userSession, S3.c<? super AnonymousClass7> cVar) {
            super(1, cVar);
            this.$session = userSession;
        }

        @Override // U3.a
        public final S3.c<C> create(S3.c<?> cVar) {
            return AuthImpl.this.new AnonymousClass7(this.$session, cVar);
        }

        @Override // e4.k
        public final Object invoke(S3.c<? super C> cVar) {
            return ((AnonymousClass7) create(cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                AuthImpl authImpl = AuthImpl.this;
                UserSession userSession = this.$session;
                this.label = 1;
                if (Auth.importSession$default(authImpl, userSession, false, null, this, 6, null) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/github/jan/supabase/auth/status/RefreshFailureCause;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$importSession$8", f = "AuthImpl.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$importSession$8, reason: invalid class name */
    public static final class AnonymousClass8 extends j implements n {
        final /* synthetic */ UserSession $session;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(UserSession userSession, S3.c<? super AnonymousClass8> cVar) {
            super(2, cVar);
            this.$session = userSession;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass8 anonymousClass8 = AuthImpl.this.new AnonymousClass8(this.$session, cVar);
            anonymousClass8.L$0 = obj;
            return anonymousClass8;
        }

        @Override // e4.n
        public final Object invoke(RefreshFailureCause refreshFailureCause, S3.c<? super C> cVar) {
            return ((AnonymousClass8) create(refreshFailureCause, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            RefreshFailureCause refreshFailureCause = (RefreshFailureCause) this.L$0;
            T3.a aVar = T3.a.f9048k;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            AuthImpl.this.updateStatusIfExpired(this.$session, refreshFailureCause);
            return C.a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$init$2", f = "AuthImpl.kt", l = {114}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$init$2, reason: invalid class name and case insensitive filesystem */
    public static final class C10862 extends j implements n {
        int label;

        public C10862(S3.c<? super C10862> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return AuthImpl.this.new C10862(cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((C10862) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            boolean z7 = false;
            int i8 = 1;
            f fVar = null;
            if (i7 == 0) {
                r.Y(obj);
                SupabaseLogger logger = Auth.INSTANCE.getLogger();
                LogLevel logLevel = LogLevel.INFO;
                LogLevel level = logger.getLevel();
                if (level == null) {
                    level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
                }
                if (logLevel.compareTo(level) >= 0) {
                    logger.log(logLevel, (Throwable) null, "Loading session from storage...");
                }
                AuthImpl authImpl = AuthImpl.this;
                this.label = 1;
                obj = Auth.loadFromStorage$default(authImpl, false, this, 1, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                SupabaseLogger logger2 = Auth.INSTANCE.getLogger();
                LogLevel logLevel2 = LogLevel.INFO;
                LogLevel level2 = logger2.getLevel();
                if (level2 == null) {
                    level2 = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
                }
                if (logLevel2.compareTo(level2) >= 0) {
                    logger2.log(logLevel2, (Throwable) null, "Successfully loaded session from storage!");
                }
            } else {
                SupabaseLogger logger3 = Auth.INSTANCE.getLogger();
                LogLevel logLevel3 = LogLevel.INFO;
                LogLevel level3 = logger3.getLevel();
                if (level3 == null) {
                    level3 = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
                }
                if (logLevel3.compareTo(level3) >= 0) {
                    logger3.log(logLevel3, (Throwable) null, "No session found in storage.");
                }
                AuthImpl.this.setSessionStatus(new SessionStatus.NotAuthenticated(z7, i8, fVar));
            }
            return C.a;
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {174, 176}, m = "linkIdentity", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$linkIdentity$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10871 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C10871(S3.c<? super C10871> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.linkIdentity(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$linkIdentity$2", f = "AuthImpl.kt", l = {179}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$linkIdentity$2, reason: invalid class name and case insensitive filesystem */
    public static final class C10882 extends j implements n {
        final /* synthetic */ n $fetchUrl;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10882(n nVar, S3.c<? super C10882> cVar) {
            super(2, cVar);
            this.$fetchUrl = nVar;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            C10882 c10882 = new C10882(this.$fetchUrl, cVar);
            c10882.L$0 = obj;
            return c10882;
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return obj;
            }
            r.Y(obj);
            n nVar = this.$fetchUrl;
            this.L$0 = null;
            this.label = 1;
            Object objInvoke = nVar.invoke(str, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }

        @Override // e4.n
        public final Object invoke(String str, S3.c<? super String> cVar) {
            return ((C10882) create(str, cVar)).invokeSuspend(C.a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/github/jan/supabase/auth/user/UserSession;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$linkIdentity$3", f = "AuthImpl.kt", l = {182}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$linkIdentity$3, reason: invalid class name */
    public static final class AnonymousClass3 extends j implements n {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass3(S3.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = AuthImpl.this.new AnonymousClass3(cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // e4.n
        public final Object invoke(UserSession userSession, S3.c<? super C> cVar) {
            return ((AnonymousClass3) create(userSession, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            UserSession userSession = (UserSession) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                AuthImpl authImpl = AuthImpl.this;
                SessionSource.UserIdentitiesChanged userIdentitiesChanged = new SessionSource.UserIdentitiesChanged(userSession);
                this.L$0 = null;
                this.label = 1;
                if (Auth.importSession$default(authImpl, userSession, false, userIdentitiesChanged, this, 2, null) == aVar) {
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

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {532, 534}, m = "loadFromStorage", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$loadFromStorage$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10891 extends U3.c {
        int I$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C10891(S3.c<? super C10891> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.loadFromStorage(false, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {651}, m = "parseErrorResponse", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$parseErrorResponse$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10901 extends U3.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C10901(S3.c<? super C10901> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.parseErrorResponse(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$preparePKCEIfEnabled$1", f = "AuthImpl.kt", l = {636}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$preparePKCEIfEnabled$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10911 extends j implements n {
        final /* synthetic */ String $codeVerifier;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10911(String str, S3.c<? super C10911> cVar) {
            super(2, cVar);
            this.$codeVerifier = str;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return AuthImpl.this.new C10911(this.$codeVerifier, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((C10911) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                CodeVerifierCache codeVerifierCache = AuthKt.getAuth(AuthImpl.this.getSupabaseClient()).getCodeVerifierCache();
                String str = this.$codeVerifier;
                this.label = 1;
                if (codeVerifierCache.saveCodeVerifier(str, this) == aVar) {
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

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {412, 416}, m = "refreshCurrentSession", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$refreshCurrentSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10921 extends U3.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C10921(S3.c<? super C10921> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.refreshCurrentSession(this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {662, 668}, m = "refreshSession", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$refreshSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10931 extends U3.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C10931(S3.c<? super C10931> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.refreshSession(null, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {656, 662}, m = "retrieveSSOUrl", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$retrieveSSOUrl$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10941 extends U3.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
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

        public C10941(S3.c<? super C10941> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.retrieveSSOUrl(null, null, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {651, 365}, m = "retrieveUser", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$retrieveUser$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10951 extends U3.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C10951(S3.c<? super C10951> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.retrieveUser(null, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {370, 375}, m = "retrieveUserForCurrentSession", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$retrieveUserForCurrentSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10961 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C10961(S3.c<? super C10961> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.retrieveUserForCurrentSession(false, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {656, 663, 148}, m = "signInAnonymously", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$signInAnonymously$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10971 extends U3.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C10971(S3.c<? super C10971> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.signInAnonymously(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/github/jan/supabase/auth/user/UserSession;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$signInWith$2", f = "AuthImpl.kt", l = {139}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$signInWith$2, reason: invalid class name and case insensitive filesystem */
    public static final class C10982 extends j implements n {

        /* JADX INFO: Incorrect field signature: TProvider; */
        final /* synthetic */ AuthProvider $provider;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lio/github/jan/supabase/auth/AuthImpl;TProvider;LS3/c<-Lio/github/jan/supabase/auth/AuthImpl$signInWith$2;>;)V */
        public C10982(AuthProvider authProvider, S3.c cVar) {
            super(2, cVar);
            this.$provider = authProvider;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            C10982 c10982 = AuthImpl.this.new C10982(this.$provider, cVar);
            c10982.L$0 = obj;
            return c10982;
        }

        @Override // e4.n
        public final Object invoke(UserSession userSession, S3.c<? super C> cVar) {
            return ((C10982) create(userSession, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            UserSession userSession = (UserSession) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                AuthImpl authImpl = AuthImpl.this;
                SessionSource.SignIn signIn = new SessionSource.SignIn(this.$provider);
                this.L$0 = null;
                this.label = 1;
                if (Auth.importSession$default(authImpl, userSession, false, signIn, this, 2, null) == aVar) {
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

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {651, 313}, m = "signOut", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$signOut$1, reason: invalid class name and case insensitive filesystem */
    public static final class C10991 extends U3.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C10991(S3.c<? super C10991> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.signOut(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/github/jan/supabase/auth/user/UserSession;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl$signUpWith$2", f = "AuthImpl.kt", l = {156}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$signUpWith$2, reason: invalid class name and case insensitive filesystem */
    public static final class C11002 extends j implements n {

        /* JADX INFO: Incorrect field signature: TProvider; */
        final /* synthetic */ AuthProvider $provider;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lio/github/jan/supabase/auth/AuthImpl;TProvider;LS3/c<-Lio/github/jan/supabase/auth/AuthImpl$signUpWith$2;>;)V */
        public C11002(AuthProvider authProvider, S3.c cVar) {
            super(2, cVar);
            this.$provider = authProvider;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            C11002 c11002 = AuthImpl.this.new C11002(this.$provider, cVar);
            c11002.L$0 = obj;
            return c11002;
        }

        @Override // e4.n
        public final Object invoke(UserSession userSession, S3.c<? super C> cVar) {
            return ((C11002) create(userSession, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            UserSession userSession = (UserSession) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                AuthImpl authImpl = AuthImpl.this;
                SessionSource.SignUp signUp = new SessionSource.SignUp(this.$provider);
                this.L$0 = null;
                this.label = 1;
                if (Auth.importSession$default(authImpl, userSession, false, signUp, this, 2, null) == aVar) {
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

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {471, 475, 476, 477, 480, 485, 486, 487}, m = "tryImportingSession", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$tryImportingSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11011 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11011(S3.c<? super C11011> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.tryImportingSession(null, null, null, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {651}, m = "unlinkIdentity", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$unlinkIdentity$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11021 extends U3.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C11021(S3.c<? super C11021> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.unlinkIdentity(null, false, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {657, 664, 245}, m = "updateUser", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$updateUser$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11031 extends U3.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C11031(S3.c<? super C11031> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.updateUser(false, null, null, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.AuthImpl", f = "AuthImpl.kt", l = {656, 662, 332}, m = "verify", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthImpl$verify$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11041 extends U3.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
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

        public C11041(S3.c<? super C11041> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthImpl.this.verify(null, null, null, null, this);
        }
    }

    public AuthImpl(SupabaseClient supabaseClient, AuthConfig authConfig) {
        l.f("supabaseClient", supabaseClient);
        l.f("config", authConfig);
        this.supabaseClient = supabaseClient;
        this.config = authConfig;
        Y yB = N.b(SessionStatus.Initializing.INSTANCE);
        this._sessionStatus = yB;
        this.sessionStatus = new I(yB);
        M mA = N.a(6, null);
        this._events = mA;
        this.events = new H(mA);
        AbstractC0281w coroutineDispatcher = getConfig().getCoroutineDispatcher();
        this.authScope = D.c((coroutineDispatcher == null ? getSupabaseClient().getCoroutineDispatcher() : coroutineDispatcher).plus(D.e()));
        SessionManager sessionManager = getConfig().getSessionManager();
        this.sessionManager = sessionManager == null ? SettingsUtilKt.createDefaultSessionManager(this) : sessionManager;
        CodeVerifierCache codeVerifierCache = getConfig().getCodeVerifierCache();
        this.codeVerifierCache = codeVerifierCache == null ? SettingsUtilKt.createDefaultCodeVerifierCache(this) : codeVerifierCache;
        this.api = AuthenticatedSupabaseApiKt.authenticatedSupabaseApi$default(getSupabaseClient(), this, (k) null, 2, (Object) null);
        this.admin = new AdminApiImpl(this);
        this.mfa = new MfaApiImpl(this);
        SupabaseSerializer serializer = getConfig().getSerializer();
        this.serializer = serializer == null ? getSupabaseClient().getDefaultSerializer() : serializer;
        if (getSupabaseClient().getAccessToken() != null) {
            throw new IllegalStateException("The Auth plugin is not available when using a custom access token provider. Please uninstall the Auth plugin.");
        }
    }

    private final RestException checkErrorCodes(GoTrueErrorResponse error, HttpResponse response) {
        List<String> reasons;
        String error2 = error.getError();
        if (l.a(error2, AuthWeakPasswordException.CODE)) {
            String description = error.getDescription();
            GoTrueErrorResponse.WeakPassword weakPassword = error.getWeakPassword();
            if (weakPassword == null || (reasons = weakPassword.getReasons()) == null) {
                reasons = y.f7779k;
            }
            return new AuthWeakPasswordException(description, response, reasons);
        }
        if (l.a(error2, AuthSessionMissingException.CODE)) {
            D.x(this.authScope, null, new AnonymousClass1(null), 3);
            return new AuthSessionMissingException(response);
        }
        String error3 = error.getError();
        if (error3 != null) {
            return new AuthRestException(error3, error.getDescription(), response);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object delayBeforeExpiry(UserSession userSession, S3.c<? super C> cVar) {
        A5.d expiresAt = userSession.getExpiresAt();
        int i7 = A5.a.f239n;
        long expiresIn = userSession.getExpiresIn();
        A5.c cVar2 = A5.c.f243n;
        long jO = g.o(expiresIn, cVar2);
        expiresAt.getClass();
        A5.d dVarB = expiresAt.b(A5.a.j(jO)).b(A5.a.g(g.o(userSession.getExpiresIn(), cVar2), 0.8d));
        A5.d dVarS = A5.f.a.s();
        dVarB.getClass();
        l.f("other", dVarS);
        long jF = A5.a.f(g.o(dVarB.f251k - dVarS.f251k, cVar2), g.n(dVarB.f252l - dVarS.f252l, A5.c.f241l));
        SupabaseLogger logger = Auth.INSTANCE.getLogger();
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = logger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            logger.log(logLevel, (Throwable) null, "Refreshing session in " + ((Object) A5.a.i(jF)) + '.');
        }
        Object objL = D.l(jF, cVar);
        return objL == T3.a.f9048k ? objL : C.a;
    }

    public static /* synthetic */ void getApi$auth_kt_release$annotations() {
    }

    public static /* synthetic */ void getAuthScope$auth_kt_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (importSession((io.github.jan.supabase.auth.user.UserSession) r10, r9, r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleExpiredSession(io.github.jan.supabase.auth.user.UserSession r8, boolean r9, S3.c<? super O3.C> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof io.github.jan.supabase.auth.AuthImpl.C10841
            if (r0 == 0) goto L13
            r0 = r10
            io.github.jan.supabase.auth.AuthImpl$handleExpiredSession$1 r0 = (io.github.jan.supabase.auth.AuthImpl.C10841) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.auth.AuthImpl$handleExpiredSession$1 r0 = new io.github.jan.supabase.auth.AuthImpl$handleExpiredSession$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.L$1
            io.github.jan.supabase.auth.user.UserSession r8 = (io.github.jan.supabase.auth.user.UserSession) r8
            java.lang.Object r8 = r0.L$0
            io.github.jan.supabase.auth.user.UserSession r8 = (io.github.jan.supabase.auth.user.UserSession) r8
            P3.r.Y(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            boolean r9 = r0.Z$0
            java.lang.Object r8 = r0.L$0
            io.github.jan.supabase.auth.user.UserSession r8 = (io.github.jan.supabase.auth.user.UserSession) r8
            P3.r.Y(r10)
            goto L78
        L45:
            P3.r.Y(r10)
            io.github.jan.supabase.auth.Auth$Companion r10 = io.github.jan.supabase.auth.Auth.INSTANCE
            io.github.jan.supabase.logging.SupabaseLogger r10 = r10.getLogger()
            io.github.jan.supabase.logging.LogLevel r2 = io.github.jan.supabase.logging.LogLevel.DEBUG
            io.github.jan.supabase.logging.LogLevel r6 = r10.getLevel()
            if (r6 != 0) goto L5c
            io.github.jan.supabase.SupabaseClient$Companion r6 = io.github.jan.supabase.SupabaseClient.INSTANCE
            io.github.jan.supabase.logging.LogLevel r6 = r6.getDEFAULT_LOG_LEVEL()
        L5c:
            int r6 = r2.compareTo(r6)
            if (r6 < 0) goto L67
            java.lang.String r6 = "Session expired. Refreshing session..."
            r10.log(r2, r5, r6)
        L67:
            java.lang.String r10 = r8.getRefreshToken()
            r0.L$0 = r8
            r0.Z$0 = r9
            r0.label = r4
            java.lang.Object r10 = r7.refreshSession(r10, r0)
            if (r10 != r1) goto L78
            goto L8d
        L78:
            io.github.jan.supabase.auth.user.UserSession r10 = (io.github.jan.supabase.auth.user.UserSession) r10
            io.github.jan.supabase.auth.status.SessionSource$Refresh r2 = new io.github.jan.supabase.auth.status.SessionSource$Refresh
            r2.<init>(r8)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.Z$0 = r9
            r0.label = r3
            java.lang.Object r8 = r7.importSession(r10, r9, r2, r0)
            if (r8 != r1) goto L8e
        L8d:
            return r1
        L8e:
            O3.C r8 = O3.C.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.handleExpiredSession(io.github.jan.supabase.auth.user.UserSession, boolean, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object handleExpiredSession$default(AuthImpl authImpl, UserSession userSession, boolean z7, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = true;
        }
        return authImpl.handleExpiredSession(userSession, z7, cVar);
    }

    private final String preparePKCEIfEnabled() {
        if (getConfig().getFlowType() != FlowType.PKCE) {
            return null;
        }
        String strGenerateCodeVerifier = PKCEKt.generateCodeVerifier();
        D.x(this.authScope, null, new C10911(strGenerateCodeVerifier, null), 3);
        return PKCEKt.generateCodeChallenge(strGenerateCodeVerifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object resend(String str, k kVar, S3.c<? super C> cVar) {
        AuthenticatedSupabaseApi authenticatedSupabaseApi = this.api;
        v vVar = new v();
        n6.d.V(LinkHeader.Parameters.Type, str, vVar);
        v vVar2 = new v();
        kVar.invoke(vVar2);
        io.github.jan.supabase.UtilsKt.putJsonObject(vVar, vVar2.a());
        final kotlinx.serialization.json.c cVarA = vVar.a();
        final ContentType json = ContentType.Application.INSTANCE.getJson();
        Object objRequest = authenticatedSupabaseApi.request("resend", new k() { // from class: io.github.jan.supabase.auth.AuthImpl$resend$$inlined$postJson$default$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
                HttpMessagePropertiesKt.contentType(httpRequestBuilder, json);
                Object obj = cVarA;
                InterfaceC1444w interfaceC1444wA = null;
                if (obj == null) {
                    httpRequestBuilder.setBody(NullBody.INSTANCE);
                    InterfaceC1425d interfaceC1425dB = kotlin.jvm.internal.y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = kotlin.jvm.internal.y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused) {
                    }
                    AbstractC0703b.z(interfaceC1425dB, interfaceC1444wA, httpRequestBuilder);
                    return;
                }
                if (obj instanceof OutgoingContent) {
                    httpRequestBuilder.setBody(obj);
                    httpRequestBuilder.setBodyType(null);
                } else {
                    httpRequestBuilder.setBody(obj);
                    InterfaceC1425d interfaceC1425dB2 = kotlin.jvm.internal.y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = kotlin.jvm.internal.y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused2) {
                    }
                    AbstractC0703b.z(interfaceC1425dB2, interfaceC1444wA, httpRequestBuilder);
                }
            }
        }, cVar);
        return objRequest == T3.a.f9048k ? objRequest : C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C resendEmail$lambda$0(String str, String str2, v vVar) {
        l.f("$this$resend", vVar);
        n6.d.V("email", str, vVar);
        if (str2 != null) {
            JsonUtilsKt.putCaptchaToken(vVar, str2);
        }
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C resendPhone$lambda$0(String str, String str2, v vVar) {
        l.f("$this$resend", vVar);
        n6.d.V("phone", str, vVar);
        if (str2 != null) {
            JsonUtilsKt.putCaptchaToken(vVar, str2);
        }
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        if (r8.invoke(r0) == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014b, code lost:
    
        if (r8.invoke(r0) != r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e5, code lost:
    
        if (r8.invoke(r0) != r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x022b, code lost:
    
        if (clearSession(r0) == r1) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tryImportingSession(e4.k r8, e4.k r9, e4.n r10, S3.c<? super O3.C> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.tryImportingSession(e4.k, e4.k, e4.n, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStatusIfExpired(UserSession session, RefreshFailureCause reason) {
        if (session.getExpiresAt().compareTo(A5.f.a.s()) <= 0) {
            SupabaseLogger logger = Auth.INSTANCE.getLogger();
            LogLevel logLevel = LogLevel.DEBUG;
            LogLevel level = logger.getLevel();
            if (level == null) {
                level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
            }
            if (logLevel.compareTo(level) >= 0) {
                logger.log(logLevel, (Throwable) null, "Session expired while trying to refresh the session. Updating status...");
            }
            setSessionStatus(new SessionStatus.RefreshFailure(reason));
        }
        emitEvent(new AuthEvent.RefreshFailure(reason));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(1:(1:(3:14|38|39)(2:15|16))(2:17|(1:35)(2:40|41)))(1:18))(6:19|(1:21)|(1:23)|24|(0)|37)|27|42|28|31|(1:(0)(0))|37) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0112, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x015f, code lost:
    
        if (io.github.jan.supabase.auth.Auth.importSession$default(r8, (io.github.jan.supabase.auth.user.UserSession) r13, false, r4, r5, 2, null) == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object verify(java.lang.String r9, java.lang.String r10, java.lang.String r11, e4.k r12, S3.c<? super O3.C> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.verify(java.lang.String, java.lang.String, java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C verifyEmailOtp$lambda$0(String str, v vVar) {
        l.f("$this$verify", vVar);
        n6.d.V("email", str, vVar);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C verifyEmailOtp$lambda$1(String str, v vVar) {
        l.f("$this$verify", vVar);
        n6.d.V("token_hash", str, vVar);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C verifyPhoneOtp$lambda$0(String str, v vVar) {
        l.f("$this$verify", vVar);
        n6.d.V("phone", str, vVar);
        return C.a;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public Object awaitInitialization(S3.c<? super C> cVar) {
        Object objI = N.i(getSessionStatus(), new AnonymousClass2(null), cVar);
        return objI == T3.a.f9048k ? objI : C.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6.deleteSession(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object clearSession(S3.c<? super O3.C> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.github.jan.supabase.auth.AuthImpl.C10821
            if (r0 == 0) goto L13
            r0 = r6
            io.github.jan.supabase.auth.AuthImpl$clearSession$1 r0 = (io.github.jan.supabase.auth.AuthImpl.C10821) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.auth.AuthImpl$clearSession$1 r0 = new io.github.jan.supabase.auth.AuthImpl$clearSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            P3.r.Y(r6)
            goto L53
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            P3.r.Y(r6)
            goto L46
        L36:
            P3.r.Y(r6)
            io.github.jan.supabase.auth.CodeVerifierCache r6 = r5.getCodeVerifierCache()
            r0.label = r4
            java.lang.Object r6 = r6.deleteCodeVerifier(r0)
            if (r6 != r1) goto L46
            goto L52
        L46:
            io.github.jan.supabase.auth.SessionManager r6 = r5.getSessionManager()
            r0.label = r3
            java.lang.Object r6 = r6.deleteSession(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            H5.f0 r6 = r5.sessionJob
            r0 = 0
            if (r6 == 0) goto L5b
            r6.e(r0)
        L5b:
            io.github.jan.supabase.auth.status.SessionStatus$NotAuthenticated r6 = new io.github.jan.supabase.auth.status.SessionStatus$NotAuthenticated
            r6.<init>(r4)
            r5.setSessionStatus(r6)
            r5.sessionJob = r0
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.clearSession(S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public Object close(S3.c<? super C> cVar) {
        D.h(this.authScope, null);
        return C.a;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public /* bridge */ String currentAccessTokenOrNull() {
        return super.currentAccessTokenOrNull();
    }

    @Override // io.github.jan.supabase.auth.Auth
    public /* bridge */ List<Identity> currentIdentitiesOrNull() {
        return super.currentIdentitiesOrNull();
    }

    @Override // io.github.jan.supabase.auth.Auth
    public /* bridge */ UserSession currentSessionOrNull() {
        return super.currentSessionOrNull();
    }

    @Override // io.github.jan.supabase.auth.Auth
    public /* bridge */ UserInfo currentUserOrNull() {
        return super.currentUserOrNull();
    }

    @Override // io.github.jan.supabase.auth.Auth
    public void emitEvent(AuthEvent event) {
        l.f("event", event);
        SupabaseLogger logger = Auth.INSTANCE.getLogger();
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = logger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            logger.log(logLevel, (Throwable) null, "Emitting event " + event);
        }
        this._events.a(event);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0123 A[PHI: r13 r15
      0x0123: PHI (r13v8 boolean) = (r13v7 boolean), (r13v15 boolean) binds: [B:34:0x0120, B:21:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r15v12 java.lang.Object) = (r15v11 java.lang.Object), (r15v1 java.lang.Object) binds: [B:34:0x0120, B:21:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f A[PHI: r13 r14
      0x014f: PHI (r13v10 boolean) = (r13v8 boolean), (r13v16 boolean) binds: [B:39:0x014c, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r14v8 io.github.jan.supabase.auth.user.UserSession) = (r14v7 io.github.jan.supabase.auth.user.UserSession), (r14v35 io.github.jan.supabase.auth.user.UserSession) binds: [B:39:0x014c, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object exchangeCodeForSession(java.lang.String r13, boolean r14, S3.c<? super io.github.jan.supabase.auth.user.UserSession> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.exchangeCodeForSession(java.lang.String, boolean, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.auth.Auth
    public AdminApi getAdmin() {
        return this.admin;
    }

    /* renamed from: getApi$auth_kt_release, reason: from getter */
    public final AuthenticatedSupabaseApi getApi() {
        return this.api;
    }

    @Override // io.github.jan.supabase.plugins.MainPlugin
    public int getApiVersion() {
        return 1;
    }

    /* renamed from: getAuthScope$auth_kt_release, reason: from getter */
    public final A getAuthScope() {
        return this.authScope;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public CodeVerifierCache getCodeVerifierCache() {
        return this.codeVerifierCache;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public J getEvents() {
        return this.events;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public MfaApi getMfa() {
        return this.mfa;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public String getOAuthUrl(OAuthProvider oAuthProvider, String str, String str2, k kVar) {
        l.f("provider", oAuthProvider);
        l.f("url", str2);
        l.f("additionalConfig", kVar);
        ExternalAuthConfigDefaults externalAuthConfigDefaults = new ExternalAuthConfigDefaults();
        kVar.invoke(externalAuthConfigDefaults);
        String strPreparePKCEIfEnabled = preparePKCEIfEnabled();
        if (strPreparePKCEIfEnabled != null) {
            externalAuthConfigDefaults.getQueryParams().put("code_challenge", strPreparePKCEIfEnabled);
            externalAuthConfigDefaults.getQueryParams().put("code_challenge_method", PKCEConstants.CHALLENGE_METHOD);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2 + "?provider=" + oAuthProvider.getName() + "&redirect_to=" + str);
        if (!externalAuthConfigDefaults.getScopes().isEmpty()) {
            sb.append("&scopes=" + q.y0(externalAuthConfigDefaults.getScopes(), "+", null, null, null, 62));
        }
        if (!externalAuthConfigDefaults.getQueryParams().isEmpty()) {
            for (Map.Entry<String, String> entry : externalAuthConfigDefaults.getQueryParams().entrySet()) {
                sb.append("&" + entry.getKey() + '=' + entry.getValue());
            }
        }
        return resolveUrl(sb.toString());
    }

    @Override // io.github.jan.supabase.plugins.MainPlugin
    public String getPluginKey() {
        return Auth.INSTANCE.getKey();
    }

    @Override // io.github.jan.supabase.plugins.CustomSerializationPlugin
    public SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    public final InterfaceC0265f0 getSessionJob() {
        return this.sessionJob;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public SessionManager getSessionManager() {
        return this.sessionManager;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public W getSessionStatus() {
        return this.sessionStatus;
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public SupabaseClient getSupabaseClient() {
        return this.supabaseClient;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public /* bridge */ Object importAuthToken(String str, String str2, boolean z7, boolean z8, S3.c<? super C> cVar) {
        return super.importAuthToken(str, str2, z7, z8, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        if (r4.saveSession(r1, r5) == r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01af, code lost:
    
        if (r4.saveSession(r1, r5) == r6) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0222  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object importSession(io.github.jan.supabase.auth.user.UserSession r18, boolean r19, io.github.jan.supabase.auth.status.SessionSource r20, S3.c<? super O3.C> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.importSession(io.github.jan.supabase.auth.user.UserSession, boolean, io.github.jan.supabase.auth.status.SessionSource, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public void init() {
        Auth.Companion companion = Auth.INSTANCE;
        SupabaseLogger logger = companion.getLogger();
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = logger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        f fVar = null;
        if (logLevel.compareTo(level) >= 0) {
            logger.log(logLevel, (Throwable) null, "Initializing Auth plugin...");
        }
        if (getConfig().getAutoLoadFromStorage()) {
            D.x(this.authScope, null, new C10862(null), 3);
        } else {
            SupabaseLogger logger2 = companion.getLogger();
            LogLevel level2 = logger2.getLevel();
            if (level2 == null) {
                level2 = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
            }
            if (logLevel.compareTo(level2) >= 0) {
                logger2.log(logLevel, (Throwable) null, "Skipping loading from storage (autoLoadFromStorage is set to false)");
            }
            setSessionStatus(new SessionStatus.NotAuthenticated(false, 1, fVar));
        }
        SetupPlatformKt.setupPlatform(this);
        SupabaseLogger logger3 = companion.getLogger();
        LogLevel level3 = logger3.getLevel();
        if (level3 == null) {
            level3 = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level3) >= 0) {
            logger3.log(logLevel, (Throwable) null, "Initialized Auth plugin");
        }
    }

    @Override // io.github.jan.supabase.auth.Auth
    public boolean isAutoRefreshRunning() {
        InterfaceC0265f0 interfaceC0265f0 = this.sessionJob;
        return interfaceC0265f0 != null && interfaceC0265f0.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object linkIdentity(io.github.jan.supabase.auth.providers.OAuthProvider r7, java.lang.String r8, e4.k r9, S3.c<? super java.lang.String> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.github.jan.supabase.auth.AuthImpl.C10871
            if (r0 == 0) goto L13
            r0 = r10
            io.github.jan.supabase.auth.AuthImpl$linkIdentity$1 r0 = (io.github.jan.supabase.auth.AuthImpl.C10871) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.auth.AuthImpl$linkIdentity$1 r0 = new io.github.jan.supabase.auth.AuthImpl$linkIdentity$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L57
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.L$3
            e4.n r7 = (e4.n) r7
            java.lang.Object r7 = r0.L$2
            e4.k r7 = (e4.k) r7
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$0
            io.github.jan.supabase.auth.providers.OAuthProvider r7 = (io.github.jan.supabase.auth.providers.OAuthProvider) r7
            P3.r.Y(r10)
            goto La2
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            java.lang.Object r7 = r0.L$3
            e4.n r7 = (e4.n) r7
            java.lang.Object r7 = r0.L$2
            e4.k r7 = (e4.k) r7
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$0
            io.github.jan.supabase.auth.providers.OAuthProvider r7 = (io.github.jan.supabase.auth.providers.OAuthProvider) r7
            P3.r.Y(r10)
            return r10
        L57:
            P3.r.Y(r10)
            io.github.jan.supabase.auth.providers.ExternalAuthConfigDefaults r10 = new io.github.jan.supabase.auth.providers.ExternalAuthConfigDefaults
            r10.<init>()
            r9.invoke(r10)
            boolean r10 = r10.getAutomaticallyOpenUrl()
            io.github.jan.supabase.auth.AuthImpl$linkIdentity$fetchUrl$1 r2 = new io.github.jan.supabase.auth.AuthImpl$linkIdentity$fetchUrl$1
            r2.<init>(r6, r7, r9, r5)
            if (r10 != 0) goto L85
            if (r8 != 0) goto L71
            java.lang.String r8 = ""
        L71:
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r0.Z$0 = r10
            r0.label = r4
            java.lang.Object r7 = r2.invoke(r8, r0)
            if (r7 != r1) goto L84
            goto La1
        L84:
            return r7
        L85:
            io.github.jan.supabase.auth.AuthImpl$linkIdentity$2 r7 = new io.github.jan.supabase.auth.AuthImpl$linkIdentity$2
            r7.<init>(r2, r5)
            io.github.jan.supabase.auth.AuthImpl$linkIdentity$3 r9 = new io.github.jan.supabase.auth.AuthImpl$linkIdentity$3
            r9.<init>(r5)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r0.Z$0 = r10
            r0.label = r3
            java.lang.Object r7 = io.github.jan.supabase.auth.Utils_androidKt.startExternalAuth(r6, r8, r7, r9, r0)
            if (r7 != r1) goto La2
        La1:
            return r1
        La2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.linkIdentity(io.github.jan.supabase.auth.providers.OAuthProvider, java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadFromStorage(boolean r8, S3.c<? super java.lang.Boolean> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.github.jan.supabase.auth.AuthImpl.C10891
            if (r0 == 0) goto L13
            r0 = r9
            io.github.jan.supabase.auth.AuthImpl$loadFromStorage$1 r0 = (io.github.jan.supabase.auth.AuthImpl.C10891) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.auth.AuthImpl$loadFromStorage$1 r0 = new io.github.jan.supabase.auth.AuthImpl$loadFromStorage$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.L$1
            io.github.jan.supabase.auth.user.UserSession r8 = (io.github.jan.supabase.auth.user.UserSession) r8
            java.lang.Object r8 = r0.L$0
            io.github.jan.supabase.auth.user.UserSession r8 = (io.github.jan.supabase.auth.user.UserSession) r8
            P3.r.Y(r9)
            goto L6c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            boolean r8 = r0.Z$0
            P3.r.Y(r9)
            goto L53
        L41:
            P3.r.Y(r9)
            io.github.jan.supabase.auth.SessionManager r9 = r7.getSessionManager()
            r0.Z$0 = r8
            r0.label = r5
            java.lang.Object r9 = r9.loadSession(r0)
            if (r9 != r1) goto L53
            goto L6a
        L53:
            io.github.jan.supabase.auth.user.UserSession r9 = (io.github.jan.supabase.auth.user.UserSession) r9
            if (r9 == 0) goto L6d
            io.github.jan.supabase.auth.status.SessionSource$Storage r2 = io.github.jan.supabase.auth.status.SessionSource.Storage.INSTANCE
            r0.L$0 = r9
            r6 = 0
            r0.L$1 = r6
            r0.Z$0 = r8
            r0.I$0 = r3
            r0.label = r4
            java.lang.Object r8 = r7.importSession(r9, r8, r2, r0)
            if (r8 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r8 = r9
        L6c:
            r9 = r8
        L6d:
            if (r9 == 0) goto L70
            r3 = r5
        L70:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.loadFromStorage(boolean, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // io.github.jan.supabase.plugins.MainPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object parseErrorResponse(io.ktor.client.statement.HttpResponse r18, S3.c<? super io.github.jan.supabase.exceptions.RestException> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.parseErrorResponse(io.ktor.client.statement.HttpResponse, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.auth.Auth
    public Object reauthenticate(S3.c<? super C> cVar) {
        Object objRequest = this.api.request("reauthenticate", new k() { // from class: io.github.jan.supabase.auth.AuthImpl$reauthenticate$$inlined$get$default$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
            }
        }, cVar);
        return objRequest == T3.a.f9048k ? objRequest : C.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (io.github.jan.supabase.auth.Auth.importSession$default(r8, r9, false, r4, r5, 2, null) == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object refreshCurrentSession(S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.github.jan.supabase.auth.AuthImpl.C10921
            if (r0 == 0) goto L14
            r0 = r9
            io.github.jan.supabase.auth.AuthImpl$refreshCurrentSession$1 r0 = (io.github.jan.supabase.auth.AuthImpl.C10921) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            io.github.jan.supabase.auth.AuthImpl$refreshCurrentSession$1 r0 = new io.github.jan.supabase.auth.AuthImpl$refreshCurrentSession$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.result
            T3.a r0 = T3.a.f9048k
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r0 = r5.L$0
            io.github.jan.supabase.auth.user.UserSession r0 = (io.github.jan.supabase.auth.user.UserSession) r0
            P3.r.Y(r9)
            goto L72
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            P3.r.Y(r9)
            goto L54
        L3c:
            P3.r.Y(r9)
            io.github.jan.supabase.auth.user.UserSession r9 = r8.currentSessionOrNull()
            if (r9 == 0) goto L7d
            java.lang.String r9 = r9.getRefreshToken()
            if (r9 == 0) goto L7d
            r5.label = r3
            java.lang.Object r9 = r8.refreshSession(r9, r5)
            if (r9 != r0) goto L54
            goto L71
        L54:
            io.github.jan.supabase.auth.user.UserSession r9 = (io.github.jan.supabase.auth.user.UserSession) r9
            io.github.jan.supabase.auth.status.SessionSource$Refresh r4 = new io.github.jan.supabase.auth.status.SessionSource$Refresh
            io.github.jan.supabase.auth.user.UserSession r1 = r8.currentSessionOrNull()
            if (r1 == 0) goto L75
            r4.<init>(r1)
            r1 = 0
            r5.L$0 = r1
            r5.label = r2
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r8
            r2 = r9
            java.lang.Object r9 = io.github.jan.supabase.auth.Auth.importSession$default(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L72
        L71:
            return r0
        L72:
            O3.C r9 = O3.C.a
            return r9
        L75:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "No session found"
            r9.<init>(r0)
            throw r9
        L7d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "No refresh token found in current session"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.refreshCurrentSession(S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ed, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object refreshSession(java.lang.String r9, S3.c<? super io.github.jan.supabase.auth.user.UserSession> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.refreshSession(java.lang.String, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.auth.Auth
    public Object resendEmail(OtpType.Email email, String str, String str2, S3.c<? super C> cVar) {
        Object objResend = resend(email.getType(), new b(str, str2, 0), cVar);
        return objResend == T3.a.f9048k ? objResend : C.a;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public Object resendPhone(OtpType.Phone phone, String str, String str2, S3.c<? super C> cVar) {
        Object objResend = resend(phone.getType(), new b(str, str2, 1), cVar);
        return objResend == T3.a.f9048k ? objResend : C.a;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public Object resetPasswordForEmail(String str, final String str2, String str3, S3.c<? super C> cVar) {
        if (AbstractC2510o.g0(str)) {
            throw new IllegalArgumentException("Email must not be blank");
        }
        String strPreparePKCEIfEnabled = preparePKCEIfEnabled();
        v vVar = new v();
        n6.d.V("email", str, vVar);
        if (str3 != null) {
            JsonUtilsKt.putCaptchaToken(vVar, str3);
        }
        if (strPreparePKCEIfEnabled != null) {
            JsonUtilsKt.putCodeChallenge(vVar, strPreparePKCEIfEnabled);
        }
        final String string = vVar.a().toString();
        AuthenticatedSupabaseApi authenticatedSupabaseApi = this.api;
        final ContentType json = ContentType.Application.INSTANCE.getJson();
        Object objRequest = authenticatedSupabaseApi.request("recover", new k() { // from class: io.github.jan.supabase.auth.AuthImpl$resetPasswordForEmail$$inlined$postJson$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
                String str4 = str2;
                if (str4 != null) {
                    httpRequestBuilder.getUrl().getEncodedParameters().append("redirect_to", str4);
                }
                HttpMessagePropertiesKt.contentType(httpRequestBuilder, json);
                Object obj = string;
                InterfaceC1444w interfaceC1444wA = null;
                if (obj == null) {
                    httpRequestBuilder.setBody(NullBody.INSTANCE);
                    InterfaceC1425d interfaceC1425dB = kotlin.jvm.internal.y.a.b(String.class);
                    try {
                        interfaceC1444wA = kotlin.jvm.internal.y.a(String.class);
                    } catch (Throwable unused) {
                    }
                    AbstractC0703b.z(interfaceC1425dB, interfaceC1444wA, httpRequestBuilder);
                    return;
                }
                if (obj instanceof OutgoingContent) {
                    httpRequestBuilder.setBody(obj);
                    httpRequestBuilder.setBodyType(null);
                } else {
                    httpRequestBuilder.setBody(obj);
                    InterfaceC1425d interfaceC1425dB2 = kotlin.jvm.internal.y.a.b(String.class);
                    try {
                        interfaceC1444wA = kotlin.jvm.internal.y.a(String.class);
                    } catch (Throwable unused2) {
                    }
                    AbstractC0703b.z(interfaceC1425dB2, interfaceC1444wA, httpRequestBuilder);
                }
            }
        }, cVar);
        return objRequest == T3.a.f9048k ? objRequest : C.a;
    }

    @Override // io.github.jan.supabase.plugins.MainPlugin
    public /* bridge */ String resolveUrl(String str) {
        return super.resolveUrl(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(2:12|(2:56|57)(2:58|59))(2:13|14))(1:15))(6:16|(4:18|(0)|24|(12:31|(1:33)|34|(1:36)|(1:38)|39|(1:41)|42|(1:44)|45|(0)|54)(2:29|30))|20|(1:22)|60|61)|48|62|49|52) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
    
        if (z5.AbstractC2510o.g0(r2) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014a, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016e, code lost:
    
        if (r2 == r4) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveSSOUrl(java.lang.String r17, e4.k r18, S3.c<? super io.github.jan.supabase.auth.providers.builtin.SSO.Result> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.retrieveSSOUrl(java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveUser(final java.lang.String r7, S3.c<? super io.github.jan.supabase.auth.user.UserInfo> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.github.jan.supabase.auth.AuthImpl.C10951
            if (r0 == 0) goto L13
            r0 = r8
            io.github.jan.supabase.auth.AuthImpl$retrieveUser$1 r0 = (io.github.jan.supabase.auth.AuthImpl.C10951) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.auth.AuthImpl$retrieveUser$1 r0 = new io.github.jan.supabase.auth.AuthImpl$retrieveUser$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.L$1
            io.ktor.client.statement.HttpResponse r7 = (io.ktor.client.statement.HttpResponse) r7
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            P3.r.Y(r8)
            goto L7a
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.lang.Object r7 = r0.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$1
            io.github.jan.supabase.network.SupabaseHttpClient r7 = (io.github.jan.supabase.network.SupabaseHttpClient) r7
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            P3.r.Y(r8)
            goto L69
        L4b:
            P3.r.Y(r8)
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi r8 = r6.api
            io.github.jan.supabase.auth.AuthImpl$retrieveUser$$inlined$get$1 r2 = new io.github.jan.supabase.auth.AuthImpl$retrieveUser$$inlined$get$1
            r2.<init>()
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r7 = 0
            r0.I$0 = r7
            r0.label = r4
            java.lang.String r7 = "user"
            java.lang.Object r8 = r8.request(r7, r2, r0)
            if (r8 != r1) goto L69
            goto L79
        L69:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(r8, r5, r0, r4, r5)
            if (r8 != r1) goto L7a
        L79:
            return r1
        L7a:
            java.lang.String r8 = (java.lang.String) r8
            a6.d r7 = io.github.jan.supabase.UtilsKt.getSupabaseJson()
            r7.getClass()
            io.github.jan.supabase.auth.user.UserInfo$Companion r0 = io.github.jan.supabase.auth.user.UserInfo.INSTANCE
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0
            java.lang.Object r7 = r7.b(r8, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.retrieveUser(java.lang.String, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveUserForCurrentSession(boolean r21, S3.c<? super io.github.jan.supabase.auth.user.UserInfo> r22) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof io.github.jan.supabase.auth.AuthImpl.C10961
            if (r2 == 0) goto L17
            r2 = r1
            io.github.jan.supabase.auth.AuthImpl$retrieveUserForCurrentSession$1 r2 = (io.github.jan.supabase.auth.AuthImpl.C10961) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            io.github.jan.supabase.auth.AuthImpl$retrieveUserForCurrentSession$1 r2 = new io.github.jan.supabase.auth.AuthImpl$retrieveUserForCurrentSession$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            T3.a r3 = T3.a.f9048k
            int r4 = r2.label
            java.lang.String r5 = "No session found"
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L4a
            if (r4 == r7) goto L44
            if (r4 != r6) goto L3c
            java.lang.Object r3 = r2.L$2
            io.github.jan.supabase.auth.status.SessionStatus$Authenticated r3 = (io.github.jan.supabase.auth.status.SessionStatus.Authenticated) r3
            java.lang.Object r3 = r2.L$1
            io.github.jan.supabase.auth.user.UserSession r3 = (io.github.jan.supabase.auth.user.UserSession) r3
            java.lang.Object r2 = r2.L$0
            io.github.jan.supabase.auth.user.UserInfo r2 = (io.github.jan.supabase.auth.user.UserInfo) r2
            P3.r.Y(r1)
            return r2
        L3c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L44:
            boolean r4 = r2.Z$0
            P3.r.Y(r1)
            goto L60
        L4a:
            P3.r.Y(r1)
            java.lang.String r1 = r0.currentAccessTokenOrNull()
            if (r1 == 0) goto Lc4
            r4 = r21
            r2.Z$0 = r4
            r2.label = r7
            java.lang.Object r1 = r0.retrieveUser(r1, r2)
            if (r1 != r3) goto L60
            goto Lb4
        L60:
            r15 = r1
            io.github.jan.supabase.auth.user.UserInfo r15 = (io.github.jan.supabase.auth.user.UserInfo) r15
            if (r4 == 0) goto Lc3
            io.github.jan.supabase.auth.user.UserSession r7 = r0.currentSessionOrNull()
            if (r7 == 0) goto Lbd
            io.github.jan.supabase.auth.status.SessionStatus$Authenticated r1 = new io.github.jan.supabase.auth.status.SessionStatus$Authenticated
            r18 = 447(0x1bf, float:6.26E-43)
            r19 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            io.github.jan.supabase.auth.user.UserSession r5 = io.github.jan.supabase.auth.user.UserSession.copy$default(r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            io.github.jan.supabase.auth.status.SessionSource$UserChanged r7 = new io.github.jan.supabase.auth.status.SessionSource$UserChanged
            io.github.jan.supabase.auth.user.UserSession r8 = r0.currentSessionOrNull()
            if (r8 == 0) goto Lb5
            r7.<init>(r8)
            r1.<init>(r5, r7)
            r0.setSessionStatus(r1)
            io.github.jan.supabase.auth.AuthConfig r5 = r0.getConfig()
            boolean r5 = r5.getAutoSaveToStorage()
            if (r5 == 0) goto Lc3
            io.github.jan.supabase.auth.SessionManager r5 = r0.getSessionManager()
            io.github.jan.supabase.auth.user.UserSession r1 = r1.getSession()
            r2.L$0 = r15
            r7 = 0
            r2.L$1 = r7
            r2.L$2 = r7
            r2.Z$0 = r4
            r2.label = r6
            java.lang.Object r1 = r5.saveSession(r1, r2)
            if (r1 != r3) goto Lc3
        Lb4:
            return r3
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Session shouldn't be null"
            r1.<init>(r2)
            throw r1
        Lbd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r5)
            throw r1
        Lc3:
            return r15
        Lc4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.retrieveUserForCurrentSession(boolean, S3.c):java.lang.Object");
    }

    public final void setSessionJob(InterfaceC0265f0 interfaceC0265f0) {
        this.sessionJob = interfaceC0265f0;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public void setSessionStatus(SessionStatus status) {
        l.f("status", status);
        SupabaseLogger logger = Auth.INSTANCE.getLogger();
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = logger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            logger.log(logLevel, (Throwable) null, "Setting session status to " + status);
        }
        Y y7 = (Y) this._sessionStatus;
        y7.getClass();
        y7.i(null, status);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0118, code lost:
    
        if (io.github.jan.supabase.auth.Auth.importSession$default(r9, r10, false, r4, r5, 2, null) != r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object signInAnonymously(kotlinx.serialization.json.c r10, java.lang.String r11, S3.c<? super O3.C> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.signInAnonymously(kotlinx.serialization.json.c, java.lang.String, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.auth.Auth
    public <C, R, Provider extends AuthProvider<C, R>> Object signInWith(Provider provider, String str, k kVar, S3.c<? super C> cVar) {
        Object objLogin = provider.login(getSupabaseClient(), new C10982(provider, null), str, kVar, cVar);
        return objLogin == T3.a.f9048k ? objLogin : C.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r10.request("logout", r6, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0106, code lost:
    
        if (clearSession(r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object signOut(final io.github.jan.supabase.auth.SignOutScope r9, S3.c<? super O3.C> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.signOut(io.github.jan.supabase.auth.SignOutScope, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.auth.Auth
    public <C, R, Provider extends AuthProvider<C, R>> Object signUpWith(Provider provider, String str, k kVar, S3.c<? super R> cVar) {
        return provider.signUp(getSupabaseClient(), new C11002(provider, null), str, kVar, cVar);
    }

    @Override // io.github.jan.supabase.auth.Auth
    public Object startAutoRefreshForCurrentSession(S3.c<? super C> cVar) throws Throwable {
        UserSession userSessionCurrentSessionOrNull = currentSessionOrNull();
        if (userSessionCurrentSessionOrNull == null) {
            throw new IllegalStateException("No session found");
        }
        Object value = getSessionStatus().getValue();
        l.d("null cannot be cast to non-null type io.github.jan.supabase.auth.status.SessionStatus.Authenticated", value);
        Object objImportSession = importSession(userSessionCurrentSessionOrNull, true, ((SessionStatus.Authenticated) value).getSource(), cVar);
        return objImportSession == T3.a.f9048k ? objImportSession : C.a;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public void stopAutoRefreshForCurrentSession() {
        SupabaseLogger logger = Auth.INSTANCE.getLogger();
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = logger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            logger.log(logLevel, (Throwable) null, "Stopping auto refresh for current session");
        }
        InterfaceC0265f0 interfaceC0265f0 = this.sessionJob;
        if (interfaceC0265f0 != null) {
            interfaceC0265f0.e(null);
        }
        this.sessionJob = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object unlinkIdentity(java.lang.String r38, boolean r39, S3.c<? super O3.C> r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.unlinkIdentity(java.lang.String, boolean, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // io.github.jan.supabase.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateUser(boolean r25, final java.lang.String r26, e4.k r27, S3.c<? super io.github.jan.supabase.auth.user.UserInfo> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl.updateUser(boolean, java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.auth.Auth
    public Object verifyEmailOtp(OtpType.Email email, String str, String str2, String str3, S3.c<? super C> cVar) throws Throwable {
        Object objVerify = verify(email.getType(), str2, str3, new com.kusukanime.data.b(str, 3), cVar);
        return objVerify == T3.a.f9048k ? objVerify : C.a;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public Object verifyPhoneOtp(OtpType.Phone phone, String str, String str2, String str3, S3.c<? super C> cVar) throws Throwable {
        Object objVerify = verify(phone.getType(), str2, str3, new com.kusukanime.data.b(str, 4), cVar);
        return objVerify == T3.a.f9048k ? objVerify : C.a;
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public AuthConfig getConfig() {
        return this.config;
    }

    @Override // io.github.jan.supabase.auth.Auth
    public Object verifyEmailOtp(OtpType.Email email, String str, String str2, S3.c<? super C> cVar) throws Throwable {
        Object objVerify = verify(email.getType(), null, str2, new com.kusukanime.data.b(str, 2), cVar);
        return objVerify == T3.a.f9048k ? objVerify : C.a;
    }
}
