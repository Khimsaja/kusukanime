package io.ktor.http;

import P3.E;
import P3.m;
import P3.r;
import e4.k;
import io.ktor.http.ContentDisposition;
import io.ktor.http.Parameters;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000F\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000b\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u0006\u0010\u000e\u001a'\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000f¢\u0006\u0004\b\u0006\u0010\u0011\u001aE\u0010\u0006\u001a\u00020\u000526\u0010\u0014\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u00130\u0012\"\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u0013¢\u0006\u0004\b\u0006\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001c\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"", ContentDisposition.Parameters.Size, "Lio/ktor/http/ParametersBuilder;", "ParametersBuilder", "(I)Lio/ktor/http/ParametersBuilder;", "Lio/ktor/http/Parameters;", "parametersOf", "()Lio/ktor/http/Parameters;", "", ContentDisposition.Parameters.Name, "value", "(Ljava/lang/String;Ljava/lang/String;)Lio/ktor/http/Parameters;", "", "values", "(Ljava/lang/String;Ljava/util/List;)Lio/ktor/http/Parameters;", "", "map", "(Ljava/util/Map;)Lio/ktor/http/Parameters;", "", "LO3/l;", "pairs", "([LO3/l;)Lio/ktor/http/Parameters;", "Lkotlin/Function1;", "LO3/C;", "builder", "parameters", "(Le4/k;)Lio/ktor/http/Parameters;", "other", "plus", "(Lio/ktor/http/Parameters;Lio/ktor/http/Parameters;)Lio/ktor/http/Parameters;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParametersKt {
    public static final ParametersBuilder ParametersBuilder(int i7) {
        return new ParametersBuilderImpl(i7);
    }

    public static /* synthetic */ ParametersBuilder ParametersBuilder$default(int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 8;
        }
        return ParametersBuilder(i7);
    }

    public static final Parameters parameters(k kVar) {
        l.f("builder", kVar);
        Parameters.Companion companion = Parameters.INSTANCE;
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersBuilder$default(0, 1, null);
        kVar.invoke(parametersBuilderParametersBuilder$default);
        return parametersBuilderParametersBuilder$default.build();
    }

    public static final Parameters parametersOf() {
        return Parameters.INSTANCE.getEmpty();
    }

    public static final Parameters plus(Parameters parameters, Parameters parameters2) {
        l.f("<this>", parameters);
        l.f("other", parameters2);
        if (parameters.getCaseInsensitiveName() != parameters2.getCaseInsensitiveName()) {
            throw new IllegalArgumentException("Cannot concatenate Parameters with case-sensitive and case-insensitive names");
        }
        if (parameters.isEmpty()) {
            return parameters2;
        }
        if (parameters2.isEmpty()) {
            return parameters;
        }
        Parameters.Companion companion = Parameters.INSTANCE;
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersBuilder$default(0, 1, null);
        parametersBuilderParametersBuilder$default.appendAll(parameters);
        parametersBuilderParametersBuilder$default.appendAll(parameters2);
        return parametersBuilderParametersBuilder$default.build();
    }

    public static final Parameters parametersOf(String str, String str2) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("value", str2);
        return new ParametersSingleImpl(str, r.H(str2));
    }

    public static final Parameters parametersOf(String str, List<String> list) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("values", list);
        return new ParametersSingleImpl(str, list);
    }

    public static final Parameters parametersOf(Map<String, ? extends List<String>> map) {
        l.f("map", map);
        return new ParametersImpl(map);
    }

    public static final Parameters parametersOf(O3.l... lVarArr) {
        l.f("pairs", lVarArr);
        return new ParametersImpl(E.r0(m.P(lVarArr)));
    }
}
