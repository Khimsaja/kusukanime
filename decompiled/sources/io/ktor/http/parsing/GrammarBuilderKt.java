package io.ktor.http.parsing;

import e4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lio/ktor/http/parsing/GrammarBuilder;", "LO3/C;", "block", "Lio/ktor/http/parsing/Grammar;", "grammar", "(Le4/k;)Lio/ktor/http/parsing/Grammar;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GrammarBuilderKt {
    public static final Grammar grammar(k kVar) {
        l.f("block", kVar);
        GrammarBuilder grammarBuilder = new GrammarBuilder();
        kVar.invoke(grammarBuilder);
        return grammarBuilder.build();
    }
}
