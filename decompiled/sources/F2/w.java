package F2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final class w extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f2462b;

    public /* synthetic */ w(y yVar, int i7) {
        this.a = i7;
        this.f2462b = yVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                y yVar = this.f2462b;
                View view = yVar.f2468b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = yVar.f2469c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = yVar.f2471e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                this.f2462b.i(0);
                break;
            case 3:
                this.f2462b.i(0);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                ViewGroup viewGroup3 = this.f2462b.f2472f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    break;
                }
                break;
            case 5:
                ViewGroup viewGroup4 = this.f2462b.f2474h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        y yVar = this.f2462b;
        switch (this.a) {
            case 0:
                View view = yVar.f2476j;
                if ((view instanceof C0149e) && !yVar.f2465A) {
                    C0149e c0149e = (C0149e) view;
                    ValueAnimator valueAnimator = c0149e.f2334O;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(c0149e.f2335P, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = yVar.f2468b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = yVar.f2469c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = yVar.f2471e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(yVar.f2465A ? 0 : 4);
                }
                View view3 = yVar.f2476j;
                if ((view3 instanceof C0149e) && !yVar.f2465A) {
                    C0149e c0149e2 = (C0149e) view3;
                    ValueAnimator valueAnimator2 = c0149e2.f2334O;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    c0149e2.f2336Q = false;
                    valueAnimator2.setFloatValues(c0149e2.f2335P, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                yVar.i(4);
                break;
            case 3:
                yVar.i(4);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                ViewGroup viewGroup3 = yVar.f2474h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    yVar.f2474h.setTranslationX(r9.getWidth());
                    ViewGroup viewGroup4 = yVar.f2474h;
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    break;
                }
                break;
            default:
                ViewGroup viewGroup5 = yVar.f2472f;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
