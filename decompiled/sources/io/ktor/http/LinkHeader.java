package io.ktor.http;

import P3.m;
import P3.q;
import P3.r;
import io.ktor.sse.ServerSentEventKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002¢\u0006\u0004\b\u0007\u0010\fB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lio/ktor/http/LinkHeader;", "Lio/ktor/http/HeaderValueWithParameters;", "", "uri", "", "Lio/ktor/http/HeaderValueParam;", "params", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", Parameters.Rel, "(Ljava/lang/String;Ljava/lang/String;)V", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "Lio/ktor/http/ContentType;", Parameters.Type, "(Ljava/lang/String;Ljava/util/List;Lio/ktor/http/ContentType;)V", "getUri", "()Ljava/lang/String;", "Parameters", "Rel", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LinkHeader extends HeaderValueWithParameters {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lio/ktor/http/LinkHeader$Parameters;", "", "<init>", "()V", "", "Rel", "Ljava/lang/String;", "Anchor", Parameters.Rev, "HrefLang", "Media", "Title", "Type", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Parameters {
        public static final String Anchor = "anchor";
        public static final String HrefLang = "hreflang";
        public static final Parameters INSTANCE = new Parameters();
        public static final String Media = "media";
        public static final String Rel = "rel";
        public static final String Rev = "Rev";
        public static final String Title = "title";
        public static final String Type = "type";

        private Parameters() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lio/ktor/http/LinkHeader$Rel;", "", "<init>", "()V", "", "Stylesheet", "Ljava/lang/String;", "Prefetch", "DnsPrefetch", "PreConnect", "PreLoad", "PreRender", "Next", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Rel {
        public static final String DnsPrefetch = "dns-prefetch";
        public static final Rel INSTANCE = new Rel();
        public static final String Next = "next";
        public static final String PreConnect = "preconnect";
        public static final String PreLoad = "preload";
        public static final String PreRender = "prerender";
        public static final String Prefetch = "prefetch";
        public static final String Stylesheet = "stylesheet";

        private Rel() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkHeader(String str, List<HeaderValueParam> list) {
        super(A6.b.j(new StringBuilder("<"), str, '>'), list);
        l.f("uri", str);
        l.f("params", list);
    }

    public final String getUri() {
        return AbstractC2510o.p0(AbstractC2510o.o0(getContent(), "<"), ">");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(String str, String str2) {
        this(str, (List<HeaderValueParam>) r.H(new HeaderValueParam(Parameters.Rel, str2)));
        l.f("uri", str);
        l.f(Parameters.Rel, str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(String str, String... strArr) {
        this(str, (List<HeaderValueParam>) r.H(new HeaderValueParam(Parameters.Rel, m.n0(strArr, ServerSentEventKt.SPACE, null, null, null, 62))));
        l.f("uri", str);
        l.f(Parameters.Rel, strArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(String str, List<String> list, ContentType contentType) {
        this(str, (List<HeaderValueParam>) r.I(new HeaderValueParam(Parameters.Rel, q.y0(list, ServerSentEventKt.SPACE, null, null, null, 62)), new HeaderValueParam(Parameters.Type, contentType.toString())));
        l.f("uri", str);
        l.f(Parameters.Rel, list);
        l.f(Parameters.Type, contentType);
    }
}
