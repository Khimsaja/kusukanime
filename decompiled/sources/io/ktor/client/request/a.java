package io.ktor.client.request;

import O3.l;
import e4.k;
import io.ktor.client.request.forms.FormBuildersKt;
import io.ktor.client.utils.HeadersKt;
import io.ktor.events.EventDefinition;
import io.ktor.events.Events;
import io.ktor.http.CookieKt;
import io.ktor.http.CookieUtilsKt;
import io.ktor.http.FileContentTypeKt;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpUrlEncodedKt;
import io.ktor.http.RangesSpecifier;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLBuilderKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.cio.CIOHeaders;
import io.ktor.http.cio.ConnectionOptions;
import io.ktor.http.cio.internals.AsciiCharTree;
import io.ktor.http.cio.internals.CharsKt;
import io.ktor.network.sockets.DatagramSendChannelKt;
import io.ktor.network.sockets.SocketOptions;
import io.ktor.network.sockets.TcpSocketBuilder;
import io.ktor.util.GzipHeaderFlags;
import z5.InterfaceC2505j;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12152k;

    public /* synthetic */ a(int i7) {
        this.f12152k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12152k) {
            case 0:
                return BuildersJvmKt.head$lambda$12((HttpRequestBuilder) obj);
            case 1:
                return BuildersJvmKt.prepareRequest$lambda$16((HttpRequestBuilder) obj);
            case 2:
                return BuildersJvmKt.post$lambda$4((HttpRequestBuilder) obj);
            case 3:
                return BuildersJvmKt.prepareHead$lambda$28((HttpRequestBuilder) obj);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return BuildersJvmKt.get$lambda$2((HttpRequestBuilder) obj);
            case 5:
                return HttpRequestKt.invoke$lambda$2((URLBuilder) obj);
            case 6:
                return HttpRequestKt.url$lambda$1((URLBuilder) obj);
            case 7:
                return FormBuildersKt.prepareForm$lambda$6((HttpRequestBuilder) obj);
            case 8:
                return FormBuildersKt.submitForm$lambda$1((HttpRequestBuilder) obj);
            case 9:
                return HeadersKt.buildHeaders$lambda$0((HeadersBuilder) obj);
            case 10:
                return Events.subscribe$lambda$0((EventDefinition) obj);
            case 11:
                return Boolean.valueOf(CookieUtilsKt.isDelimiter(((Character) obj).charValue()));
            case 12:
                return Boolean.valueOf(CookieUtilsKt.isNonDelimiter(((Character) obj).charValue()));
            case 13:
                return Boolean.valueOf(CookieUtilsKt.isNonDelimiter(((Character) obj).charValue()));
            case 14:
                return Boolean.valueOf(CookieUtilsKt.isDelimiter(((Character) obj).charValue()));
            case 15:
                return CookieKt.parseClientCookiesHeader$lambda$4((InterfaceC2505j) obj);
            case 16:
                return CookieKt.parseClientCookiesHeader$lambda$6((l) obj);
            case 17:
                return FileContentTypeKt.extensionsByContentType_delegate$lambda$3$lambda$2((l) obj);
            case 18:
                return HttpUrlEncodedKt.formUrlEncodeTo$lambda$5((l) obj);
            case 19:
                return Boolean.valueOf(RangesSpecifier.isValid$lambda$1((String) obj));
            case 20:
                return URLBuilderKt.set$lambda$5((URLBuilder) obj);
            case 21:
                return URLUtilsKt.appendUrlFullPath$lambda$6((l) obj);
            case 22:
                return CIOHeaders.getAll$lambda$2((CharSequence) obj);
            case 23:
                return Integer.valueOf(ConnectionOptions.knownTypes$lambda$1((l) obj));
            case 24:
                return Integer.valueOf(AsciiCharTree.Companion.build$lambda$0((CharSequence) obj));
            case 25:
                return Integer.valueOf(CharsKt.DefaultHttpMethods$lambda$0((HttpMethod) obj));
            case 26:
                return DatagramSendChannelKt.CLOSED$lambda$0((Throwable) obj);
            case 27:
                return DatagramSendChannelKt.CLOSED_INVOKED$lambda$1((Throwable) obj);
            case 28:
                return TcpSocketBuilder.connect$lambda$0((SocketOptions.TCPClientSocketOptions) obj);
            default:
                return TcpSocketBuilder.bind$lambda$3((SocketOptions.AcceptorOptions) obj);
        }
    }
}
