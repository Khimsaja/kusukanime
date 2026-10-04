package A3;

import H5.h0;
import O.H;
import O3.C;
import P3.AbstractC0560a;
import P3.AbstractC0565f;
import Z5.C0628c0;
import Z5.t0;
import Z5.u0;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import f.AbstractC0841b;
import f6.AbstractC0897K;
import io.github.jan.supabase.auth.AndroidKt;
import io.github.jan.supabase.postgrest.executor.RestRequestExecutor;
import io.github.jan.supabase.postgrest.request.PostgrestRequest;
import io.github.jan.supabase.storage.UploadOptionBuilder;
import io.github.jan.supabase.storage.resumable.ResumableCacheEntry;
import io.github.jan.supabase.storage.resumable.ResumableClientImpl;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.HttpClientKt;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import io.ktor.client.engine.okhttp.OkHttpSSESession;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.sse.DefaultClientSSESession;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.CodecsKt;
import io.ktor.http.ContentType;
import io.ktor.http.LinkHeader;
import io.ktor.http.MimesKt;
import io.ktor.http.cio.CIOHeaders;
import io.ktor.http.cio.MultipartEvent;
import io.ktor.network.sockets.SocketBase;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.util.cio.FileChannelsKt;
import io.ktor.websocket.PingPongKt;
import java.util.Map;
import kotlin.jvm.internal.D;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.AbstractC1420H;
import l4.C1447z;
import l4.EnumC1413A;
import l4.InterfaceC1444w;
import y3.AbstractC2412a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f139k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f140l;

    public /* synthetic */ d(int i7, Object obj) {
        this.f139k = i7;
        this.f140l = obj;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        String strD;
        switch (this.f139k) {
            case 0:
                String str = (String) obj;
                kotlin.jvm.internal.l.f("it", str);
                ((B) this.f140l).f(str);
                return C.a;
            case 1:
                return obj == ((AbstractC0560a) this.f140l) ? "(this Collection)" : String.valueOf(obj);
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.l.f("it", entry);
                AbstractC0565f abstractC0565f = (AbstractC0565f) this.f140l;
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == abstractC0565f ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != abstractC0565f ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 3:
                X5.a aVar = (X5.a) obj;
                kotlin.jvm.internal.l.f("$this$buildSerialDescriptor", aVar);
                aVar.a(LinkHeader.Parameters.Type, t0.f10356b, (12 & 8) == 0);
                aVar.a("value", AbstractC1420H.k("kotlinx.serialization.Polymorphic<" + ((V5.d) this.f140l).a.n() + '>', X5.h.f9949h, new SerialDescriptor[0]), (12 & 8) == 0);
                aVar.f9919b = P3.y.f7779k;
                return C.a;
            case GzipHeaderFlags.EXTRA /* 4 */:
                X5.a aVar2 = (X5.a) obj;
                kotlin.jvm.internal.l.f("$this$buildSerialDescriptor", aVar2);
                ((C0628c0) this.f140l).getClass();
                aVar2.f9919b = P3.y.f7779k;
                return C.a;
            case 5:
                X5.a aVar3 = (X5.a) obj;
                kotlin.jvm.internal.l.f("$this$buildClassSerialDescriptor", aVar3);
                u0 u0Var = (u0) this.f140l;
                aVar3.a("first", u0Var.a.getDescriptor(), (12 & 8) == 0);
                aVar3.a("second", u0Var.f10358b.getDescriptor(), (12 & 8) == 0);
                aVar3.a("third", u0Var.f10359c.getDescriptor(), (12 & 8) == 0);
                return C.a;
            case 6:
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) obj;
                kotlin.jvm.internal.l.f("node", bVar);
                b6.y yVar = (b6.y) this.f140l;
                yVar.N((String) P3.q.A0(yVar.a), bVar);
                return C.a;
            case 7:
                kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) obj;
                kotlin.jvm.internal.l.f("it", bVar2);
                ((kotlin.jvm.internal.x) this.f140l).f12720k = bVar2;
                return C.a;
            case 8:
                return AndroidKt.handleDeeplinks$lambda$2((Uri) this.f140l, (String) obj);
            case 9:
                return RestRequestExecutor.execute$lambda$0((PostgrestRequest) this.f140l, (HttpRequestBuilder) obj);
            case 10:
                return ResumableClientImpl.resumeUpload$lambda$1((ResumableCacheEntry) this.f140l, (UploadOptionBuilder) obj);
            case 11:
                return HttpClient._init_$lambda$0((HttpClient) this.f140l, (Throwable) obj);
            case 12:
                return HttpClientConfig.install$lambda$5((HttpClientPlugin) this.f140l, (HttpClient) obj);
            case 13:
                return HttpClientKt.HttpClient$lambda$1((HttpClientEngine) this.f140l, (Throwable) obj);
            case 14:
                return OkHttpEngine.executeHttpRequest$lambda$2((AbstractC0897K) this.f140l, (Throwable) obj);
            case 15:
                return OkHttpSSESession._init_$lambda$0((OkHttpSSESession) this.f140l, (Throwable) obj);
            case 16:
                return DefaultClientSSESession._init_$lambda$0((DefaultClientSSESession) this.f140l, (Throwable) obj);
            case 17:
                return CodecsKt.encodeURLPath$lambda$6$lambda$5((StringBuilder) this.f140l, ((Byte) obj).byteValue());
            case 18:
                return MimesKt.loadMimes$lambda$1$lambda$0((ContentType) this.f140l, (String) obj);
            case 19:
                return CIOHeaders.entries$lambda$4((CIOHeaders) this.f140l, ((Integer) obj).intValue());
            case 20:
                return MultipartEvent.MultipartPart.release$lambda$0((MultipartEvent.MultipartPart) this.f140l, (Throwable) obj);
            case 21:
                return SocketBase.channelCompletionHandler$lambda$0((SocketBase) this.f140l, (Throwable) obj);
            case 22:
                return FileChannelsKt.readChannel$lambda$2((O3.q) this.f140l, (Throwable) obj);
            case 23:
                return PingPongKt.pinger$lambda$0((h0) this.f140l, (Throwable) obj);
            case 24:
                C1447z c1447z = (C1447z) obj;
                kotlin.jvm.internal.l.f("it", c1447z);
                ((D) this.f140l).getClass();
                EnumC1413A enumC1413A = c1447z.a;
                if (enumC1413A == null) {
                    return "*";
                }
                InterfaceC1444w interfaceC1444w = c1447z.f12759b;
                D d4 = interfaceC1444w instanceof D ? (D) interfaceC1444w : null;
                String strValueOf = (d4 == null || (strD = d4.d(true)) == null) ? String.valueOf(interfaceC1444w) : strD;
                int iOrdinal = enumC1413A.ordinal();
                if (iOrdinal == 0) {
                    return strValueOf;
                }
                if (iOrdinal == 1) {
                    return "in ".concat(strValueOf);
                }
                if (iOrdinal == 2) {
                    return "out ".concat(strValueOf);
                }
                throw new D6.r();
            case 25:
                D3.f.l((Context) this.f140l, ((Boolean) obj).booleanValue());
                return C.a;
            case 26:
                kotlin.jvm.internal.l.f("$this$DisposableEffect", (H) obj);
                final Window window = (Window) this.f140l;
                if (window != null) {
                    window.setLayout(-1, -1);
                    window.addFlags(512);
                    if (Build.VERSION.SDK_INT >= 28) {
                        window.getAttributes().layoutInDisplayCutoutMode = 3;
                    }
                    AbstractC0841b.p(window, false);
                    AbstractC2412a.b(window);
                    window.getDecorView().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: y3.c
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z7) {
                            if (z7) {
                                AbstractC2412a.b(window);
                            }
                        }
                    });
                }
                return new D.r(12, window);
            default:
                return ((F5.n) this.f140l).h(((Integer) obj).intValue());
        }
    }
}
