package io.ktor.network.sockets;

import G2.C0165b;
import G2.I;
import G2.Q;
import H2.t;
import O.H;
import O3.C;
import S5.n;
import a6.h;
import b1.AbstractC0703b;
import com.kusukanime.data.BookmarkRow;
import com.kusukanime.data.EpisodeRef;
import e4.k;
import io.ktor.network.sockets.SocketOptions;
import io.ktor.serialization.Configuration;
import io.ktor.serialization.ContentConverter;
import io.ktor.serialization.kotlinx.json.JsonSupportKt;
import io.ktor.util.CaseInsensitiveMap;
import io.ktor.util.CaseInsensitiveString;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.utils.io.LookAheadSuspendSession;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketDeflateExtension;
import io.ktor.websocket.WebSocketExtensionHeader;
import io.ktor.websocket.WebSocketExtensionsConfig;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12179k;

    public /* synthetic */ b(int i7) {
        this.f12179k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12179k) {
            case 0:
                return TcpSocketBuilder.connect$lambda$2((SocketOptions.TCPClientSocketOptions) obj);
            case 1:
                return TcpSocketBuilder.bind$lambda$1((SocketOptions.AcceptorOptions) obj);
            case 2:
                return UDPSocketBuilder.bind$lambda$1((SocketOptions.UDPSocketOptions) obj);
            case 3:
                return UDPSocketBuilder.bind$lambda$0((SocketOptions.UDPSocketOptions) obj);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return UDPSocketBuilder.connect$lambda$2((SocketOptions.UDPSocketOptions) obj);
            case 5:
                return Configuration.DefaultImpls.register$lambda$0((ContentConverter) obj);
            case 6:
                return JsonSupportKt.DefaultJson$lambda$0((h) obj);
            case 7:
                return CaseInsensitiveMap._get_entries_$lambda$3((Map.Entry) obj);
            case 8:
                return CaseInsensitiveMap._get_entries_$lambda$4((Map.Entry) obj);
            case 9:
                return CaseInsensitiveMap._get_keys_$lambda$1((CaseInsensitiveString) obj);
            case 10:
                return CaseInsensitiveMap._get_keys_$lambda$2((String) obj);
            case 11:
                return LookAheadSuspendSession.request$lambda$0((n) obj);
            case 12:
                return WebSocketDeflateExtension.Config.manualConfig$lambda$0((List) obj);
            case 13:
                return Boolean.valueOf(WebSocketDeflateExtension.Config.compressCondition$lambda$1((Frame) obj));
            case 14:
                return WebSocketExtensionHeader.parseParameters$lambda$0((String) obj);
            case 15:
                return WebSocketExtensionsConfig.install$lambda$0(obj);
            case 16:
                I i7 = (I) obj;
                l.f("$this$navigate", i7);
                i7.f2670b = true;
                return C.a;
            case 17:
                I i8 = (I) obj;
                l.f("$this$navigate", i8);
                i8.f2670b = true;
                return C.a;
            case 18:
                I i9 = (I) obj;
                l.f("$this$navigate", i9);
                i9.f2670b = true;
                return C.a;
            case 19:
                I i10 = (I) obj;
                l.f("$this$navigate", i10);
                i10.f2670b = true;
                return C.a;
            case 20:
                I i11 = (I) obj;
                l.f("$this$navigate", i11);
                i11.f2670b = true;
                return C.a;
            case 21:
                I i12 = (I) obj;
                l.f("$this$navigate", i12);
                i12.a("me", new b(24));
                i12.f2670b = true;
                return C.a;
            case 22:
                I i13 = (I) obj;
                l.f("$this$navigate", i13);
                i13.f2670b = true;
                return C.a;
            case 23:
                I i14 = (I) obj;
                l.f("$this$navigate", i14);
                i14.f2670b = true;
                return C.a;
            case 24:
                Q q6 = (Q) obj;
                l.f("$this$popUpTo", q6);
                q6.a = true;
                return C.a;
            case 25:
                ((I) obj).a("home", C0165b.f2692u);
                return C.a;
            case 26:
                BookmarkRow bookmarkRow = (BookmarkRow) obj;
                l.f("it", bookmarkRow);
                String id = bookmarkRow.getId();
                return AbstractC2510o.g0(id) ? bookmarkRow.getAnime_slug() : id;
            case 27:
                l.f("$this$DisposableEffect", (H) obj);
                return new t(2);
            case 28:
                String str = (String) obj;
                l.f("w", str);
                if (str.length() <= 0) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(str.charAt(0));
                l.d("null cannot be cast to non-null type java.lang.String", strValueOf);
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                l.e("toUpperCase(...)", upperCase);
                sb.append((Object) upperCase);
                String strSubstring = str.substring(1);
                l.e("substring(...)", strSubstring);
                sb.append(strSubstring);
                return sb.toString();
            default:
                EpisodeRef episodeRef = (EpisodeRef) obj;
                l.f("it", episodeRef);
                String slug = episodeRef.getSlug();
                return AbstractC2510o.g0(slug) ? AbstractC0703b.g(episodeRef.getN(), "ep-") : slug;
        }
    }
}
