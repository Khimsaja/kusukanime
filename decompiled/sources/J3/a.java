package J3;

import O3.C;
import a6.g;
import a6.s;
import a6.u;
import a6.x;
import a6.y;
import e4.InterfaceC0821a;
import io.github.jan.supabase.OSInformation;
import io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.storage.Bucket;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import io.ktor.client.plugins.cache.HttpCacheEntryKt;
import io.ktor.client.request.ClientUpgradeContent;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.utils.HeadersUtilsKt;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4290k;

    public /* synthetic */ a(int i7) {
        this.f4290k = i7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f4290k) {
            case 0:
                return UserInfo._childSerializers$_anonymous_();
            case 1:
                return UserInfo._childSerializers$_anonymous_$0();
            case 2:
                return GMTDate._childSerializers$_anonymous_();
            case 3:
                return GMTDate._childSerializers$_anonymous_$0();
            case GzipHeaderFlags.EXTRA /* 4 */:
                return Boolean.FALSE;
            case 5:
                return y.f10493b;
            case 6:
                return u.f10489b;
            case 7:
                return s.f10488b;
            case 8:
                return x.f10492b;
            case 9:
                return g.f10464b;
            case 10:
                return OSInformation.CURRENT_delegate$lambda$0();
            case 11:
                return DefaultAuthProvider.Config._init_$_anonymous_();
            case 12:
                return Bucket._childSerializers$_anonymous_();
            case 13:
                return HttpClientConfig.install$lambda$5$lambda$4();
            case 14:
                return OkHttpEngine.okHttpClientPrototype_delegate$lambda$5();
            case 15:
                return DefaultRequest.DefaultRequestBuilder.setCapability$lambda$1();
            case 16:
                return DoubleReceivePluginKt.LOGGER_delegate$lambda$0();
            case 17:
                return C.a;
            case 18:
                return C.a;
            case 19:
                return C.a;
            case 20:
                return HttpCacheEntryKt.cacheExpires$lambda$0();
            case 21:
                return Long.valueOf(DateJvmKt.getTimeMillis());
            case 22:
                return ClientUpgradeContent.content_delegate$lambda$0();
            case 23:
                return HttpRequestBuilder.setCapability$lambda$0();
            case 24:
                return C.a;
            case 25:
                return C.a;
            case 26:
                return C.a;
            case 27:
                return C.a;
            case 28:
                return C.a;
            default:
                return HeadersUtilsKt.dropCompressionHeaders$lambda$0();
        }
    }
}
