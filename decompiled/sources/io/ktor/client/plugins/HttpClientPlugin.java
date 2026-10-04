package io.ktor.client.plugins;

import O3.C;
import e4.k;
import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J%\u0010\u0007\u001a\u00028\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lio/ktor/client/plugins/HttpClientPlugin;", "", "TConfig", "TPlugin", "Lkotlin/Function1;", "LO3/C;", "block", "prepare", "(Le4/k;)Ljava/lang/Object;", "plugin", "Lio/ktor/client/HttpClient;", "scope", "install", "(Ljava/lang/Object;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "key", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface HttpClientPlugin<TConfig, TPlugin> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object prepare$default(HttpClientPlugin httpClientPlugin, k kVar, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepare");
            }
            if ((i7 & 1) != 0) {
                kVar = new io.ktor.client.b(12);
            }
            return httpClientPlugin.prepare(kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C prepare$lambda$0(Object obj) {
            l.f("<this>", obj);
            return C.a;
        }
    }

    AttributeKey<TPlugin> getKey();

    void install(TPlugin plugin, HttpClient scope);

    TPlugin prepare(k block);
}
