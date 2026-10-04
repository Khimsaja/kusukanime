package io.ktor.http;

import P3.q;
import P3.r;
import P3.y;
import e4.n;
import io.ktor.http.ContentDisposition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/ktor/http/HeaderValueWithParameters;", "", "", "content", "", "Lio/ktor/http/HeaderValueParam;", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", ContentDisposition.Parameters.Name, "parameter", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getContent", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "Companion", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class HeaderValueWithParameters {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String content;
    private final List<HeaderValueParam> parameters;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lio/ktor/http/HeaderValueWithParameters$Companion;", "", "<init>", "()V", "R", "", "value", "Lkotlin/Function2;", "", "Lio/ktor/http/HeaderValueParam;", "init", "parse", "(Ljava/lang/String;Le4/n;)Ljava/lang/Object;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final <R> R parse(String value, n init) {
            l.f("value", value);
            l.f("init", init);
            HeaderValue headerValue = (HeaderValue) q.A0(HttpHeaderValueParserKt.parseHeaderValue(value));
            return (R) init.invoke(headerValue.getValue(), headerValue.getParams());
        }

        private Companion() {
        }
    }

    public HeaderValueWithParameters(String str, List<HeaderValueParam> list) {
        l.f("content", str);
        l.f("parameters", list);
        this.content = str;
        this.parameters = list;
    }

    public final String getContent() {
        return this.content;
    }

    public final List<HeaderValueParam> getParameters() {
        return this.parameters;
    }

    public final String parameter(String name) {
        l.f(ContentDisposition.Parameters.Name, name);
        int iY = r.y(this.parameters);
        if (iY < 0) {
            return null;
        }
        int i7 = 0;
        while (true) {
            HeaderValueParam headerValueParam = this.parameters.get(i7);
            if (AbstractC2517v.M(headerValueParam.getName(), name, true)) {
                return headerValueParam.getValue();
            }
            if (i7 == iY) {
                return null;
            }
            i7++;
        }
    }

    public String toString() {
        if (this.parameters.isEmpty()) {
            return this.content;
        }
        int length = this.content.length();
        int i7 = 0;
        int length2 = 0;
        for (HeaderValueParam headerValueParam : this.parameters) {
            length2 += headerValueParam.getValue().length() + headerValueParam.getName().length() + 3;
        }
        StringBuilder sb = new StringBuilder(length + length2);
        sb.append(this.content);
        int iY = r.y(this.parameters);
        if (iY >= 0) {
            while (true) {
                HeaderValueParam headerValueParam2 = this.parameters.get(i7);
                sb.append("; ");
                sb.append(headerValueParam2.getName());
                sb.append("=");
                String value = headerValueParam2.getValue();
                if (HeaderValueWithParametersKt.needQuotes(value)) {
                    sb.append(HeaderValueWithParametersKt.quote(value));
                } else {
                    sb.append(value);
                }
                if (i7 == iY) {
                    break;
                }
                i7++;
            }
        }
        String string = sb.toString();
        l.c(string);
        return string;
    }

    public /* synthetic */ HeaderValueWithParameters(String str, List list, int i7, f fVar) {
        this(str, (i7 & 2) != 0 ? y.f7779k : list);
    }
}
