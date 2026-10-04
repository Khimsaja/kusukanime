package F2;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2461b;

    public /* synthetic */ v(int i7, Object obj) {
        this.a = i7;
        this.f2461b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y yVar = (y) this.f2461b;
                yVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = yVar.f2468b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup = yVar.f2469c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = yVar.f2471e;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                    break;
                }
                break;
            case 1:
                y yVar2 = (y) this.f2461b;
                yVar2.getClass();
                yVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                y yVar3 = (y) this.f2461b;
                yVar3.getClass();
                yVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                y yVar4 = (y) this.f2461b;
                yVar4.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = yVar4.f2468b;
                if (view2 != null) {
                    view2.setAlpha(fFloatValue2);
                }
                ViewGroup viewGroup3 = yVar4.f2469c;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue2);
                }
                ViewGroup viewGroup4 = yVar4.f2471e;
                if (viewGroup4 != null) {
                    viewGroup4.setAlpha(fFloatValue2);
                    break;
                }
                break;
            default:
                C0149e c0149e = (C0149e) this.f2461b;
                c0149e.getClass();
                c0149e.f2335P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0149e.invalidate(c0149e.f2345k);
                break;
        }
    }
}
