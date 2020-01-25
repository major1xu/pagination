
/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 paginate(1, 30, 11) == "[1] 2 3 4 5 6 7 8 9 10 ... 30"
paginate(5, 30, 11) == "1 2 3 4 [5] 6 7 8 9 10 ... 30"

paginate(7, 30, 11) == "1 ... 3 4 5 6 [7] 8 9 10 11 ... 30"
paginate(10, 30, 11) == "1 ... 6 7 8 9 [10] 11 12 13 14 ... 30"
paginate(24, 30, 11) == "1 ... 20 21 22 23 [24] 25 26 27 28 ... 30"
paginate(30, 30, 11) == "1 ... 21 22 23 24 25 26 27 28 29 [30]"
 */

class Pagination {
    public static void main(String[] args) {
        Pagination.paginate(1, 30, 11);
        Pagination.paginate(5, 30, 11);
        Pagination.paginate(7, 30, 11);
        Pagination.paginate(10, 30, 11);
        Pagination.paginate(24, 30, 11);
    }

    static void paginate(int curPage, int totalPages, int maxVisiblePages) {
        int count =0;

        if(curPage<=5)
        {
            for(int ii=1; ii<=totalPages; ii++)
            {
                if(count < maxVisiblePages-1)
                {
                    // if curPage <= 5; need to consider the other end as well, curPage>=26 
                    //if(curPage <= maxVisiblePages/2){
                    if(count==curPage-1)
                    {
                        System.out.print("[");
                        System.out.print(ii);
                    }
                    else
                    {
                        System.out.print(ii+" ");
                    }

                    if(count==curPage-1)
                        System.out.print("] ");

                    count++;
                }
                else
                {
                    System.out.print(totalPages);
                    break;
                }
            }
            System.out.println("");
        }
        else if(curPage > maxVisiblePages/2 && curPage <=totalPages- maxVisiblePages/2)
        {
            System.out.print("1 ");
            count = 1;
            for(int ii=curPage-maxVisiblePages/2+1; ii<curPage+maxVisiblePages/2; ii++)
            {


                if(count==maxVisiblePages/2)
                {
                    System.out.print("[");
                    System.out.print(ii);
                }
                else
                {
                    System.out.print(ii+" ");
                }

                if(count==maxVisiblePages/2)
                    System.out.print("] ");

                count++;

            }
            System.out.println(totalPages);
        }
    }

}


/* 
Your previous Plain Text content is preserved below:

Write a function that returns a string representing the state of a pagination nav bar (e.g., the one at the bottom of a page of Google search results).
________________________________________________________________

Rules:

2.5 millon burn rate yearly



====

1. The number of pages returned should not exceed the value of the "maxVisiblePages" parameter

2. Always show the first page

3. Always show the last page

4. Put ellipses where appropriate

5. Place [] around the selected page and, if possible, center it
_________________________________________________________________

function paginate(curPage, totalPages, maxVisiblePages) {}

(feel free to change function/parameter naming to match your language's conventions)
_________________________________________________________________

Example inputs and outputs:

paginate(1, 30, 11) == "[1] 2 3 4 5 6 7 8 9 10 ... 30"
paginate(5, 30, 11) == "1 2 3 4 [5] 6 7 8 9 10 ... 30"
paginate(7, 30, 11) == "1 ... 3 4 5 6 [7] 8 9 10 11 ... 30"
paginate(10, 30, 11) == "1 ... 6 7 8 9 [10] 11 12 13 14 ... 30"
paginate(24, 30, 11) == "1 ... 20 21 22 23 [24] 25 26 27 28 ... 30"
paginate(30, 30, 11) == "1 ... 21 22 23 24 25 26 27 28 29 [30]"

----------------------------------------------------------------

Please choose the language you're most comfortable with; I'll assume the language you choose is the language you know best.

Getting to a non-optimal working solution is fine; we can iterate from there together as needed.

Don't feel obligated to speak out loud as you brainstorm or code, but don't hesitate to do so if it helps you.

Feel free to ask any clarifying questions.

Lastly, have fun!
 */
