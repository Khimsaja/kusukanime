package o6;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class d extends Handler {
    public static final d a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        kotlin.jvm.internal.l.f("record", logRecord);
        CopyOnWriteArraySet copyOnWriteArraySet = c.a;
        String loggerName = logRecord.getLoggerName();
        kotlin.jvm.internal.l.e("record.loggerName", loggerName);
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i7 = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        kotlin.jvm.internal.l.e("record.message", message);
        Throwable thrown = logRecord.getThrown();
        String strI0 = (String) c.f13821b.get(loggerName);
        if (strI0 == null) {
            strI0 = AbstractC2510o.I0(23, loggerName);
        }
        if (Log.isLoggable(strI0, i7)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i8 = 0;
            while (i8 < length) {
                int iD0 = AbstractC2510o.d0(message, '\n', i8, 4);
                if (iD0 == -1) {
                    iD0 = length;
                }
                while (true) {
                    iMin = Math.min(iD0, i8 + 4000);
                    String strSubstring = message.substring(i8, iMin);
                    kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
                    Log.println(i7, strI0, strSubstring);
                    if (iMin >= iD0) {
                        break;
                    } else {
                        i8 = iMin;
                    }
                }
                i8 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
