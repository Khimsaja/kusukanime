package io.ktor.http.parsing;

import D6.r;
import io.ktor.sse.ServerSentEventKt;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/http/parsing/Grammar;", "", "offset", "LO3/C;", "printDebug", "(Lio/ktor/http/parsing/Grammar;I)V", "", "node", "printlnWithOffset", "(ILjava/lang/Object;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DebugKt {
    public static final void printDebug(Grammar grammar, int i7) {
        l.f("<this>", grammar);
        if (grammar instanceof StringGrammar) {
            StringBuilder sb = new StringBuilder("STRING[");
            String value = ((StringGrammar) grammar).getValue();
            l.f("literal", value);
            String strQuote = Pattern.quote(value);
            l.e("quote(...)", strQuote);
            sb.append(strQuote);
            sb.append(']');
            printlnWithOffset(i7, sb.toString());
            return;
        }
        if (grammar instanceof RawGrammar) {
            printlnWithOffset(i7, "STRING[" + ((RawGrammar) grammar).getValue() + ']');
            return;
        }
        if (grammar instanceof NamedGrammar) {
            StringBuilder sb2 = new StringBuilder("NAMED[");
            NamedGrammar namedGrammar = (NamedGrammar) grammar;
            sb2.append(namedGrammar.getName());
            sb2.append(']');
            printlnWithOffset(i7, sb2.toString());
            printDebug(namedGrammar.getGrammar(), i7 + 2);
            return;
        }
        if (grammar instanceof SequenceGrammar) {
            printlnWithOffset(i7, "SEQUENCE");
            Iterator<T> it = ((SequenceGrammar) grammar).getGrammars().iterator();
            while (it.hasNext()) {
                printDebug((Grammar) it.next(), i7 + 2);
            }
            return;
        }
        if (grammar instanceof OrGrammar) {
            printlnWithOffset(i7, "OR");
            Iterator<T> it2 = ((OrGrammar) grammar).getGrammars().iterator();
            while (it2.hasNext()) {
                printDebug((Grammar) it2.next(), i7 + 2);
            }
            return;
        }
        if (grammar instanceof MaybeGrammar) {
            printlnWithOffset(i7, "MAYBE");
            printDebug(((MaybeGrammar) grammar).getGrammar(), i7 + 2);
            return;
        }
        if (grammar instanceof ManyGrammar) {
            printlnWithOffset(i7, "MANY");
            printDebug(((ManyGrammar) grammar).getGrammar(), i7 + 2);
            return;
        }
        if (grammar instanceof AtLeastOne) {
            printlnWithOffset(i7, "MANY_NOT_EMPTY");
            printDebug(((AtLeastOne) grammar).getGrammar(), i7 + 2);
            return;
        }
        if (grammar instanceof AnyOfGrammar) {
            StringBuilder sb3 = new StringBuilder("ANY_OF[");
            String value2 = ((AnyOfGrammar) grammar).getValue();
            l.f("literal", value2);
            String strQuote2 = Pattern.quote(value2);
            l.e("quote(...)", strQuote2);
            sb3.append(strQuote2);
            sb3.append(']');
            printlnWithOffset(i7, sb3.toString());
            return;
        }
        if (!(grammar instanceof RangeGrammar)) {
            throw new r();
        }
        StringBuilder sb4 = new StringBuilder("RANGE[");
        RangeGrammar rangeGrammar = (RangeGrammar) grammar;
        sb4.append(rangeGrammar.getFrom());
        sb4.append('-');
        sb4.append(rangeGrammar.getTo());
        sb4.append(']');
        printlnWithOffset(i7, sb4.toString());
    }

    public static /* synthetic */ void printDebug$default(Grammar grammar, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        printDebug(grammar, i7);
    }

    private static final void printlnWithOffset(int i7, Object obj) {
        System.out.println((Object) (AbstractC2517v.P(i7, ServerSentEventKt.SPACE) + (i7 / 2) + ": " + obj));
    }
}
